package se.tre.subscription.dtos;

public record IntegrationSubscription(
        String subscriptionId,
        String msisdn,
        IntegrationEndUser endUser) {
}
