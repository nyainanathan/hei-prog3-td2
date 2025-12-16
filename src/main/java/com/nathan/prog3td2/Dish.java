package com.nathan.prog3td2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Dish {
    private int id;
    private String name;
    private DishTypeEnum dishType;
    private List<Ingredient> ingredients;

    public double getDishPrice(){
        return ingredients.stream()
                .mapToDouble(Ingredient::getPrice)
                .sum();
    }
}
