package ru.exchange.generator.mybank.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.exchange.generator.mybank.client.ExchangeClient;

@Getter
@Service
@EnableScheduling
@RequiredArgsConstructor
public class ExchangeGeneratorService {

    private final ExchangeClient exchangeClient;

    Map<String, Float> exchangeGeneratorRates;

    @Scheduled(fixedRate = 1000)
    public void generateExchangeRates() {
        exchangeGeneratorRates = generateRandomRates();
        exchangeClient.sendRates(exchangeGeneratorRates);
    }

    public Map<String, Float> generateRandomRates() {
        Map<String, Float> rates = new HashMap<>();
        rates.put("USD", getRandomValue(29.99f, 33.99f));
        rates.put("CNY", getRandomValue(10.99f, 14.99f));
        return rates;
    }

    protected float getRandomValue(float min, float max) {
        float randomValue = ThreadLocalRandom.current().nextFloat(min, max);
        return Math.round(randomValue * 100.0) / 100.0f;
    }
}
