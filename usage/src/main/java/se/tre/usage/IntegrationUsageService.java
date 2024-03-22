package se.tre.usage;

import se.tre.usage.dtos.IntegrationUsage;
import se.tre.usage.dtos.IntegrationUsageType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class IntegrationUsageService {

    public List<IntegrationUsage> getIntegrationUsages(final String subscriptionId) {
        return List.of(
                new IntegrationUsage(subscriptionId, IntegrationUsageType.DATA, BigDecimal.TEN, "GB"),
                new IntegrationUsage(subscriptionId, IntegrationUsageType.VOICE, BigDecimal.TEN, "MINUTES")
        );
    }

}
