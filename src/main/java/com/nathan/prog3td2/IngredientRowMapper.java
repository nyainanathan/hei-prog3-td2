package com.nathan.prog3td2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IngredientRowMapper {
    public Ingredient map(ResultSet rs) throws SQLException {
        return new Ingredient(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("price"),
                CategoryEnum.valueOf(rs.getString("category"))
        );
    }
}
