package ru.exchange.generator.mybank.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.exchange.generator.mybank.model.ExchangeGeneratorService;
import ru.exchange.generator.mybank.model.domain.Rate;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ExchangeGeneratorController {

    private final ExchangeGeneratorService exchangeService;

    @PostMapping
    public List<Rate> exchangeGenerator() {

        return exchangeService.getExchangeGeneratorRates();
    }
}
