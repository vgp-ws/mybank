package ru.exchange.generator.mybank.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.exchange.generator.mybank.model.ExchangeGeneratorService;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ExchangeGeneratorController {

    private final ExchangeGeneratorService exchangeService;

    @PostMapping
    public Map<String, Float> exchange() {

        return exchangeService.getExchangeRates();
    }
}
