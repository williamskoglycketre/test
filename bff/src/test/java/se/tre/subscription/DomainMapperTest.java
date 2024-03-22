package se.tre.subscription;

import org.junit.jupiter.api.Test;
import se.tre.subscription.dtos.IntegrationEndUser;
import se.tre.subscription.dtos.IntegrationSubscription;
import se.tre.subscription.model.EndUser;
import se.tre.subscription.model.Subscription;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DomainMapperTest {

    @Test
    void mapSubscription_validInput_shouldMapToDomain() {
        final IntegrationSubscription integrationSubscription = new IntegrationSubscription(
                "123456789",
                "4612345678",
                new IntegrationEndUser("Keyser", "Soze"));

        final Subscription actual = DomainMapper.mapSubscription(integrationSubscription);

        final Subscription expected = new Subscription("123456789", "4612345678", new EndUser("Keyser", "Soze"));

        assertEquals(expected, actual);
    }
}