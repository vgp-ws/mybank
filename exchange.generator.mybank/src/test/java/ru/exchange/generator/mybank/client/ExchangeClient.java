package ru.exchange.generator.mybank.client;

import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ExchangeClient {

    public void sendRates(Map<String, Float> rates) {
        // Empty
    }
}
