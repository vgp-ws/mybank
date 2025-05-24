package ru.front.mybank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.front.mybank.model.domain.Rate;

@RestController
@RequestMapping("/api")
public class RatesController {

    @GetMapping("/rates")
    public List<Rate> rates() {

        List<Rate> rates = new ArrayList<>();

        rates.add(Rate.builder()
                .title("Рубль")
                .name("RUB")
                .value(1)
                .build());

        rates.add(Rate.builder()
                .title("Доллар")
                .name("USD")
                .value(32.33f)
                .build());

        rates.add(Rate.builder()
                .title("Юань")
                .name("CNY")
                .value(14.76f)
                .build());

        return rates;
    }
}
