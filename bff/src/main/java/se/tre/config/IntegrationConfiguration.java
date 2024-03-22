package se.tre.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.tre.subscription.IntegrationSubscriptionService;
import se.tre.usage.IntegrationUsageService;

@Configuration
public class IntegrationConfiguration {

    @Bean
    public IntegrationSubscriptionService integrationSubscriptionService() {
        return new IntegrationSubscriptionService();
    }

    @Bean
    public IntegrationUsageService integrationUsageService() {
        return new IntegrationUsageService();
    }
}
