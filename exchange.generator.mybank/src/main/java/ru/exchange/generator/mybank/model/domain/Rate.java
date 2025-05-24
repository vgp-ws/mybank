package ru.exchange.generator.mybank.model.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Rate {

    private String title;
    private String name;
    private float value;
}
