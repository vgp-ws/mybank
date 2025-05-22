package ru.exchange.mybank.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.exchange.mybank.model.ExchangeService;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeService exchangeService;

    @PostMapping
    public void setCurrencyRates(@RequestBody Map<String, Float> currencyCodeToRate) {

        exchangeService.setCurrencyRates(currencyCodeToRate);
    }

    @PostMapping("/get") 
    public void getCurrencyRates(Map<String, Float> currencyCodeToRate) {

        exchangeService.setCurrencyRates(currencyCodeToRate);
    }
}
