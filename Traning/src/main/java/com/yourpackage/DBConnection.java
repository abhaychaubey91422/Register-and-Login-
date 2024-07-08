package com.yourpackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "Pass@123");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
