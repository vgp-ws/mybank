package ru.exchange.generator.mybank.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.exchange.generator.mybank.client.ExchangeClient;
import ru.exchange.generator.mybank.model.domain.Rate;

@Getter
@Service
@EnableScheduling
@RequiredArgsConstructor
public class ExchangeGeneratorService {

    private final ExchangeClient exchangeClient;

    private List<Rate> exchangeGeneratorRates;

    @Scheduled(fixedRate = 1000)
    public void sendToExchangeService() {
        exchangeGeneratorRates = generateRandomRates();
        exchangeClient.sendRates(exchangeGeneratorRates);
    }

    public List<Rate> generateRandomRates() {

        List<Rate> rates = new ArrayList<>();

        rates.add(Rate.builder()
                .title("Рубль")
                .name("RUB")
                .value(1)
                .build());

        rates.add(Rate.builder()
                .title("Доллар")
                .name("USD")
                .value(getRandomValue(29.99f, 33.99f))
                .build());

        rates.add(Rate.builder()
                .title("Юань")
                .name("CNY")
                .value(getRandomValue(10.99f, 14.99f))
                .build());
                
        return rates;
    }

    protected float getRandomValue(float min, float max) {
        float randomValue = ThreadLocalRandom.current().nextFloat(min, max);
        return Math.round(randomValue * 100.0) / 100.0f;
    }
}
