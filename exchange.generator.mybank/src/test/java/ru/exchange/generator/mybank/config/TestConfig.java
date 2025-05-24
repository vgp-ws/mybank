package ru.exchange.generator.mybank.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestClient;

import ru.exchange.generator.mybank.client.ExchangeClient;
import ru.exchange.generator.mybank.model.domain.Rate;

@Profile("test")
@Configuration
public class TestConfig {
    @Bean
    public ExchangeClient exchangeClient() {
        return new ExchangeClient(RestClient.builder()) {
            @Override
            public void sendRates(List<Rate> rates) {

            }
        };
    }
}
