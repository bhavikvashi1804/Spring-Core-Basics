package com.bhv.aop.config;

import com.bhv.aop.utils.CurrencyAPIDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@ComponentScan(basePackages = "com.bhv.aop")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    String appName(){
        return "Spring AOP Demo";
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }



    @Bean
    public WebClient currencyConverterWebClient(CurrencyAPIDetails apiDetails) {
        return WebClient.builder()
                .baseUrl(apiDetails.getURL())
                .defaultHeader("x-rapidapi-key", apiDetails.getApiKey())
                .build();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }


}
