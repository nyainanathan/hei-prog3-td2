package com.nathan.prog3td2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DishRowMapper{
    public Dish map(ResultSet rs) throws SQLException {
        return new Dish(
            rs.getInt("id"),
                rs.getString("name"),
            DishTypeEnum.valueOf(rs.getString("dish_type"))
        );
    }
}
