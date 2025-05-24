package ru.exchange.generator.mybank.client;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import lombok.RequiredArgsConstructor;
import ru.exchange.generator.mybank.model.domain.Rate;

@Component
@Profile("!test")
@RequiredArgsConstructor
public class ExchangeClient {
    
    private final RestClient.Builder restClientBuilder;

    public void sendRates(List<Rate> rates) {
        restClientBuilder.build()
                .post()
                .uri("http://exchange/exchange/")
                .contentType(MediaType.APPLICATION_JSON)
                .body(rates)
                .retrieve()
                .toBodilessEntity();
    }
}
