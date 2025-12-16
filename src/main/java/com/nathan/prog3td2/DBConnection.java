package com.nathan.prog3td2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection() {
        try {
        return DriverManager.getConnection(System.getenv("JDBC_URL"), System.getenv("JDBC_USERNAME"), System.getenv("JDBC_PASSWORD"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
