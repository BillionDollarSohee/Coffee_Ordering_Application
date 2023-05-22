package com.Coffee_Ordering_Application.coffee.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CoffeeResponseDto {
    private long coffeeId;
    private String korName;
    private String engName;
    private int hotPrice;
    private int icedPrice;
}