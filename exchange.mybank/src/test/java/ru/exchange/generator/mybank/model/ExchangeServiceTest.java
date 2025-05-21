package ru.exchange.generator.mybank.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import ru.exchange.generator.mybank.model.ExchangeService;

@SpringBootTest
@ActiveProfiles("test")
class ExchangeServiceTest {

    @Autowired
    private ExchangeService exchangeService;

    @Test
    void testGetExchangeRates_shouldDifferentValue() {

        Map<String, Float> firstData = exchangeService.getExchangeRates();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Map<String, Float> secondData = exchangeService.getExchangeRates();
        
        assertThat(firstData.get("USD")).isNotEqualTo(secondData.get("USD"));
    }
}
