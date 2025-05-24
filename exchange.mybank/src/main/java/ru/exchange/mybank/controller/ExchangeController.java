package ru.exchange.mybank.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.exchange.mybank.model.ExchangeService;
import ru.exchange.mybank.model.domain.Rate;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeService exchangeService;

    @PostMapping
    public void setCurrencyRates(@RequestBody List<Rate> currencyCodeToRate) {

        exchangeService.setCurrencyRates(currencyCodeToRate);
    }

    @PostMapping("/getrates")
    public List<Rate> getCurrencyRates() {

        return exchangeService.getExchangeRates();
    }
}
