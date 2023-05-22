package com.Coffee_Ordering_Application.order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderCoffeeResponseDto {
    private long coffeeId;
    private String korName;
    private String engName;
    private int hotPrice;
    private int icedPrice;
    private int quantity;
}