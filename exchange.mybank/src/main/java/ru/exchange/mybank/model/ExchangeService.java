package ru.exchange.mybank.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import lombok.Getter;
import ru.exchange.mybank.model.domain.Rate;

@Service
@EnableScheduling
@Getter
public class ExchangeService {

    private List<Rate> exchangeRates;

    public void setCurrencyRates(List<Rate> currencyCodeToRate) {

        exchangeRates = new ArrayList<>(currencyCodeToRate);
    }
}
