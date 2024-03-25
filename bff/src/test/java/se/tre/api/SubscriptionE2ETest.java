package se.tre.api;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import se.tre.subscription.IntegrationSubscriptionService;
import se.tre.subscription.dtos.IntegrationEndUser;
import se.tre.subscription.dtos.IntegrationSubscription;

import static org.mockito.ArgumentMatchers.eq;

@AutoConfigureWebTestClient
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SubscriptionE2ETest {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private IntegrationSubscriptionService integrationSubscriptionService;

    @Test
    void getSubscriptionTest() {
        final String subscriptionId = "12345678";
        final IntegrationSubscription mockSubscription = new IntegrationSubscription("123", "4611223344", new IntegrationEndUser("testFirstName", "testLastName"));

        Mockito
                .when(integrationSubscriptionService.getSubscription(eq(subscriptionId)))
                .thenReturn(mockSubscription);

        final String expectedJson = """
                {"subscriptionId":"123","phoneNumber":"4611223344","endUser":{"firstName":"testFirstName","lastName":"testLastName"}}""";

        webTestClient
                .get()
                .uri("/api/v1/subscriptions/{subscriptionId}", subscriptionId)
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectBody(String.class)
                .isEqualTo(expectedJson);
    }

}