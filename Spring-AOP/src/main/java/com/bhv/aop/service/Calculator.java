package com.bhv.aop.service;

import com.bhv.aop.utils.CurrencyAPIDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;
import java.util.Objects;

@Service
public class Calculator {

    @Autowired
    CurrencyAPIDetails currencyAPIDetails;

    @Autowired
    RestTemplate restTemplate;

    public Long add(Long a, Long b) {
        System.out.println(currencyAPIDetails.getURL());
        return a + b;
    }

    public Long convertUSDToINR(Long usd) {
//        String baseURL = currencyAPIDetails.getURL();
//        String apiKey = currencyAPIDetails.getApiKey();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("x-rapidapi-key", apiKey);
//
//        Map<String, Object> params = Map.of(
//                "from", "USD",
//                "to", "INR",
//                "amount", usd
//        );
//
//        String URL = addQueryParams(baseURL + "convert", params);
//        // Make the GET request with the headers
//        ResponseEntity<String> response = restTemplate.exchange(URL, HttpMethod.GET,
//                new org.springframework.http.HttpEntity<>(headers), String.class);
//
//        // Return the response body (API response)
//        String result = response.getBody();
//
//        System.out.println(result);
        return 0l;
    }

    public static String addQueryParams(String baseUrl, Map<String, Object> queryParams) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(baseUrl);

        // Add query parameters to the builder
        if (queryParams != null) {
            queryParams.forEach(uriBuilder::queryParam);
        }

        // Build and return the final URL
        return uriBuilder.toUriString();
    }

}
