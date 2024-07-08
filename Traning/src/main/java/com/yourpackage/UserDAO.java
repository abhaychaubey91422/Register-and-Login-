package com.yourpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	private Connection connection;

    public UserDAO() {
        connection = DBConnection.getConnection();
    }

    public boolean registerUser(String username, String password, String email) {
        try {
            String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            int rows = ps.executeUpdate();
            return rows > 0;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validateUser(String username, String password) {
        try {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean resetPassword(String username, String email, String newPassword) {
        try {
            String query = "UPDATE users SET password = ? WHERE username = ? AND email = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, newPassword);
            stmt.setString(2, username);
            stmt.setString(3, email);
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
