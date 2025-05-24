package ru.exchange.generator.mybank.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import ru.exchange.generator.mybank.config.TestConfig;
import ru.exchange.generator.mybank.model.domain.Rate;

@SpringBootTest
@ActiveProfiles("test")
@Import({ TestConfig.class })
class ExchangeGeneratorServiceTest {

    @Autowired
    private ExchangeGeneratorService exchangeService;

    @Test
    void testGetExchangeGeneratorRates_shouldDifferentValue() {

        List<Rate> firstData = exchangeService.getExchangeGeneratorRates();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Rate> secondData = exchangeService.getExchangeGeneratorRates();

        assertThat(firstData.get(0).getValue()).isEqualTo(secondData.get(0).getValue());
        assertThat(firstData.get(1).getValue()).isNotEqualTo(secondData.get(1).getValue());
    }
}
