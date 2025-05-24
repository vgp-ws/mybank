package ru.front.mybank.client;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ExchangeClient {
    
    private final RestClient.Builder restClientBuilder;

    public void sendRates(Map<String, Float> rates) {
        restClientBuilder.build()
                .post()
                .uri("http://exchange/exchange/get")
                .contentType(MediaType.APPLICATION_JSON)
                .body(rates)
                .retrieve()
                .toBodilessEntity();
    }
}
