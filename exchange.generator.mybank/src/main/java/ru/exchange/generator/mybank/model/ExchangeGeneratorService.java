package ru.exchange.generator.mybank.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Service
@EnableScheduling
@RequiredArgsConstructor
public class ExchangeGeneratorService {

    private final RestClient.Builder restClient;
    private final DiscoveryClient discoveryClient;

    Map<String, Float> exchangeGeneratorRates;

    @Scheduled(fixedRate = 1000)
    private void generateExchangeGenerator() {

        exchangeGeneratorRates = new HashMap<>();
        exchangeGeneratorRates.put("USD", getRandomValue(29.99f, 33.99f));
        exchangeGeneratorRates.put("CNY", getRandomValue(10.99f, 14.99f));

        // List<ServiceInstance> instances = discoveryClient.getInstances("exchange");
        // if (instances.isEmpty()) {
        // throw new IllegalStateException("No instances of 'exchange' service
        // available");
        // }

        // ServiceInstance instance = instances.get(0);

        // String urlExchange = instance.getUri() + "/exchange/";

        restClient.build()
                .post()
                .uri("http://exchange/exchange/")
                .contentType(MediaType.APPLICATION_JSON)
                .body(exchangeGeneratorRates)
                .retrieve()
                .toBodilessEntity();
    }

    private float getRandomValue(float min, float max) {
        float randomValue = ThreadLocalRandom.current().nextFloat(min, max);

        return Math.round(randomValue * 100.0) / 100.0f;
    }
}
