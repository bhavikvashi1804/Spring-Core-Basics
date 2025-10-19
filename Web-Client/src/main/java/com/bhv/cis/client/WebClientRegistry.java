package com.bhv.cis.client;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class WebClientRegistry {

    private final Map<String, WebClient> clients = new ConcurrentHashMap<>();


    public void register(String name, WebClient client) {
        clients.put(name, client);
    }

    public Optional<WebClient> get(String name) {
        return Optional.ofNullable(clients.get(name));
    }

    @Nullable
    public WebClient getOrDefault(String name, @Nullable WebClient fallback) {
        return clients.getOrDefault(name, fallback);
    }

    public void remove(String name) {
        clients.remove(name);
    }

    public boolean contains(String name) {
        return clients.containsKey(name);
    }

    public Map<String, WebClient> all() {
        return Map.copyOf(clients);
    }
}
