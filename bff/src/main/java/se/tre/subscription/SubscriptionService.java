package se.tre.subscription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tre.subscription.dtos.IntegrationSubscription;
import se.tre.subscription.model.Subscription;

@Service
public class SubscriptionService {

    @Autowired
    private IntegrationSubscriptionService integrationSubscriptionService;

    public Subscription getSubscription(final String subscriptionId) {
        final IntegrationSubscription integrationSubscription = integrationSubscriptionService.getSubscription(subscriptionId);
        return DomainMapper.mapSubscription(integrationSubscription);
    }

}
