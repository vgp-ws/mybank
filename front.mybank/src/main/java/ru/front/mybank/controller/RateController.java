package ru.front.mybank.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ru.front.mybank.model.RateService;
import ru.front.mybank.model.domain.Rate;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RateController {

    private final RateService rateService;

    @GetMapping("/rates")
    public List<Rate> rates() {

        return rateService.getRates();
    }
}
