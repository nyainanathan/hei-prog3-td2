package com.nathan.prog3td2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ingredient {
    private int id;
    private String name;
    private double price;
    private CategoryEnum category;
    private Dish dish;

    public Ingredient(int id, String name, double price, CategoryEnum category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getDishName(){
        return this.dish.getName();
    }
}
