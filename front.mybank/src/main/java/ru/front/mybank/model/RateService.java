package ru.front.mybank.model;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.front.mybank.client.ExchangeClient;
import ru.front.mybank.model.domain.Rate;

@Service
@RequiredArgsConstructor
public class RateService {

    private final ExchangeClient exchangeClient;

    public List<Rate> getRates() {

        return exchangeClient.getRates();
    }
}
