package com.bhv.aop.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class Calculator1 {

    private final WebClient webClient;
    private final ObjectMapper objectMapper;

    @Autowired
    public Calculator1(@Qualifier("currencyConverterWebClient") WebClient webClient,
                       ObjectMapper objectMapper) {
        this.webClient = webClient;
        this.objectMapper = objectMapper;
    }

    public Long add(Long a, Long b) {
        return a + b;
    }

    public Double convertUSDToINR(Long usd) throws Exception {

        String response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/convert")
                        .queryParam("from", "USD")
                        .queryParam("to", "INR")
                        .queryParam("amount", usd)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .block(); // blocking still used for simplicity

        Double result = objectMapper.readTree(response)
                .path("result").asDouble();

        return result;
    }
}
