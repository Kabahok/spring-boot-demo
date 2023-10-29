package ru.egoravdeev.springBootDemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.egoravdeev.springBootDemo.service.DevProfile;
import ru.egoravdeev.springBootDemo.service.ProductionProfile;
import ru.egoravdeev.springBootDemo.service.SystemProfile;

@Configuration
public class WebConfig {

    @Bean
    @ConditionalOnProperty(
            value="egoravdeev.profile.dev",
            havingValue="true",
            matchIfMissing = true
    )
    public SystemProfile devProfile() {
        return new DevProfile();
    }



    @Bean
    @ConditionalOnProperty(
            value="egoravdeev.profile.dev",
            havingValue="false"
    )
    public SystemProfile productionProfile() {
        return new ProductionProfile();
    }

}
