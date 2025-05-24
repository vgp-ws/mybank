package ru.front.mybank.client;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import lombok.RequiredArgsConstructor;
import ru.front.mybank.model.domain.Rate;

@Component
@RequiredArgsConstructor
public class ExchangeClient {

    private final RestClient.Builder restClientBuilder;

    public List<Rate> getRates() {
        return restClientBuilder.build()
                .post()
                .uri("http://exchange/exchange/getrates")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Rate>>() {
                });
    }
}
