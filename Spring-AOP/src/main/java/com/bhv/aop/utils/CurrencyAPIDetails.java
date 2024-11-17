package com.bhv.aop.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("api_details.properties")
@Component
public class CurrencyAPIDetails {

    @Value("${api.key}")
    private String apiKey;
    @Value("${api.host}")
    private String URL;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
