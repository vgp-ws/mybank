package ru.exchange.mybank.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
@EnableScheduling
@Getter
public class ExchangeService {

    Map<String, Float> exchangeRates;

    public void setCurrencyRates(Map<String, Float> currencyCodeToRate) {
              
      exchangeRates = new HashMap<>(currencyCodeToRate);
    }

}
