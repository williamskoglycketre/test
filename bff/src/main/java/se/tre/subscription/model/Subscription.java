package se.tre.subscription.model;

public record Subscription(
        String subscriptionId,
        String phoneNumber,
        EndUser endUser) {
}
