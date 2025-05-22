package ru.exchange.generator.mybank.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
@EnableScheduling
@Getter
public class ExchangeGeneratorService {

    Map<String, Float> exchangeGeneratorRates;

    @Scheduled(fixedRate = 1000)
    private void generateExchangeGenerator() {
       
        exchangeGeneratorRates = new HashMap<>();
        exchangeGeneratorRates.put("USD", getRandomValue(29.99f, 33.99f));
        exchangeGeneratorRates.put("CNY", getRandomValue(10.99f, 14.99f));
    }

    private float getRandomValue(float min, float max) {
        float randomValue = ThreadLocalRandom.current().nextFloat(min, max);
        
        return Math.round(randomValue * 100.0) / 100.0f;
    }
}
