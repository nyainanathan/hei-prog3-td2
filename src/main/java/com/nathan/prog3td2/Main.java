package com.nathan.prog3td2;

import java.sql.Connection;

public class Main {
    public static void main(String[] a){
        DBConnection dbConn = new DBConnection();
        Connection con = dbConn.getConnection();
    }
}
