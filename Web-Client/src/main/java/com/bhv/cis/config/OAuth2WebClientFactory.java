package com.bhv.cis.config;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class OAuth2WebClientFactory {

    private final OAuth2AuthorizedClientManager clientManager;

    public OAuth2WebClientFactory(OAuth2AuthorizedClientManager clientManager) {
        this.clientManager = clientManager;
    }

    public WebClient create(String registrationId, String baseUrl) {
        ServletOAuth2AuthorizedClientExchangeFilterFunction oauth2 =
                new ServletOAuth2AuthorizedClientExchangeFilterFunction(clientManager);
        oauth2.setDefaultClientRegistrationId(registrationId);

        return WebClient.builder()
                .baseUrl(baseUrl)
                .apply(oauth2.oauth2Configuration())
                .build();
    }
}
