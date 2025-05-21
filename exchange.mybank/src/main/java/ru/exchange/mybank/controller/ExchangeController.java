package ru.exchange.mybank.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
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
    public Map<String, Float> exchange() {

        return exchangeService.getExchangeRates();
    }
}
