package se.tre.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.tre.subscription.SubscriptionService;
import se.tre.subscription.model.Subscription;

@RestController
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(final SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping("/api/v1/subscriptions/{subscriptionId}")
    public Subscription getSubscription(@PathVariable final String subscriptionId,
                                        @RequestParam(required = false, defaultValue = "false") final Boolean includeUsage) {
        return subscriptionService.getSubscription(subscriptionId);
    }
}
