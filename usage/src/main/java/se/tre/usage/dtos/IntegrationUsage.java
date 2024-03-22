package se.tre.usage.dtos;

import java.math.BigDecimal;

public record IntegrationUsage(
        String subscriptionId,
        IntegrationUsageType usageType,
        BigDecimal amount,
        String unit) {
}
