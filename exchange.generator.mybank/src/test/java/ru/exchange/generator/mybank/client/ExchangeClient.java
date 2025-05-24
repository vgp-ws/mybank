package ru.exchange.generator.mybank.client;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestClient;

import ru.exchange.generator.mybank.model.domain.Rate;

@Primary
@Profile("test")
public class ExchangeClient {

    public ExchangeClient(RestClient.Builder restClientBuilder) {
    }

    public void sendRates(List<Rate> rates) {
        // Empty
    }
}
