package com.bhv.cis.service;


import com.bhv.cis.client.WebClientRegistry;
import com.bhv.cis.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsersService {

    private WebClient sapWebClient;

    public UsersService(WebClientRegistry webClientRegistry) {
        this.sapWebClient = webClientRegistry.get("sap-api").orElseThrow(() -> new IllegalStateException("sap-api WebClient not registered"));
    }

    public Flux<UserDTO> getUsers() {
        return sapWebClient.get().uri("/Users").retrieve().bodyToFlux(UserDTO.class);
    }

    public Mono<UserDTO> getUser(String id) {
        return sapWebClient.get().uri("/Users/{id}", id).retrieve().bodyToMono(UserDTO.class);
    }


}
