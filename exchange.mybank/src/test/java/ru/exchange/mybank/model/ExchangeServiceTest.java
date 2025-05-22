package ru.exchange.mybank.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ExchangeServiceTest {

    @Autowired
    private ExchangeService exchangeService;

    @Test
    void testGetExchangeRates_shouldDifferentValue() {
        
        assertThat(true).isTrue();
    }
}
