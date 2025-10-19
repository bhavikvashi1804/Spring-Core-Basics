package com.bhv.cis.client;


import com.bhv.cis.config.ApiClientsProperties;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@Component
public class WebClientRegistryInitializer {

    private final OAuth2WebClientFactory factory;
    private final ApiClientsProperties props;
    private final WebClientRegistry registry;

    public WebClientRegistryInitializer(OAuth2WebClientFactory factory,
                                        ApiClientsProperties props,
                                        WebClientRegistry registry) {
        this.factory = factory;
        this.props = props;
        this.registry = registry;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing WebClient Registry");
        System.out.println(props.getBaseUrls());
        props.getBaseUrls().forEach((registrationId, baseUrl) -> {
            WebClient client = factory.create(registrationId, baseUrl);
            registry.register(registrationId, client);
        });
    }
}
