package com.Coffee_Ordering_Application.coffee.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Coffee {
    @Id
    private long coffeeId;
    private String korName;
    private String engName;
    private Integer hotPrice;
    private Integer icedPrice;
    private String coffeeCode;
}
