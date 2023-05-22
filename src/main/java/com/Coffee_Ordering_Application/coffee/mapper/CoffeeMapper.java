package com.Coffee_Ordering_Application.coffee.mapper;

import com.Coffee_Ordering_Application.coffee.dto.CoffeePatchDto;
import com.Coffee_Ordering_Application.coffee.dto.CoffeePostDto;
import com.Coffee_Ordering_Application.coffee.dto.CoffeeResponseDto;
import com.Coffee_Ordering_Application.coffee.entity.Coffee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = "SPRING")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);

    // Money 타입을 사용할 경우
//    @Mapping(source = "price", target = "price.value")
//    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
//
//    @Mapping(source = "price", target = "price.value")
//    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
//
//    @Mapping(source = "price.value", target = "price")
//    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);

    List<CoffeeResponseDto> coffeesToCoffeeResponseDtos(List<Coffee> coffees);
}