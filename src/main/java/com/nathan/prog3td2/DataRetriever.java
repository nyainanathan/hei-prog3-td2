package com.nathan.prog3td2;

import lombok.RequiredArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RequiredArgsConstructor
public class DataRetriever {

    private final DBConnection dbConnection;
    private final DishRowMapper dishRowMapper;

    public Dish findDishById(Integer id){
        String dishSql = "SELECT * FROM dish WHERE id = ?";
        String IngredientsSql = "SELECT * FROM Ingredient WHERE id_dish = ?";

        try {
            Connection conn = dbConnection.getConnection();
            PreparedStatement ps1 =
        } catch (Exception e){
            throw  new RuntimeException(e);
        }
        return null;
    }
}
