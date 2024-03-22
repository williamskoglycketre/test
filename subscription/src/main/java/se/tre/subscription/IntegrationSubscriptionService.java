package se.tre.subscription;

import se.tre.subscription.dtos.IntegrationEndUser;
import se.tre.subscription.dtos.IntegrationSubscription;

public class IntegrationSubscriptionService {

    public IntegrationSubscription getSubscription(final String subscriptionId) {
        return new IntegrationSubscription(
                subscriptionId,
                "4612345678",
                new IntegrationEndUser("Keyser", "Soze")
        );
    }
}
