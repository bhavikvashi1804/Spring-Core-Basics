package com.bhv.cis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient sapWebClient(OAuth2WebClientFactory factory, @Value("${sap.api.base-url}") String baseUrl) {
        return factory.create("sap-api", baseUrl);
    }

//    @Bean
//    public WebClient docStoreWebClient(OAuth2WebClientFactory factory, @Value("${doc.api.base-url}") String baseUrl) {
//        return factory.create("doc-store-api", baseUrl);
//    }
}

