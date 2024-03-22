package com.data;

import com.model.User;
import java.sql.*;

public class UserTable extends UserTableInt {
	private Connection conn;

	public UserTable() throws Exception {
		getCon();
	}

	public void getCon() throws Exception {
		try {
			Class.forName("org.postgresql.Driver");
			java.util.Properties props = new java.util.Properties();
			props.setProperty("user", "User_Name");
			props.setProperty("password", "User_Password");
			conn = DriverManager.getConnection("jdbc:postgresql:database", props);
		} catch (Exception e) {
			try {
				Class.forName("org.sqlite.JDBC");
				conn = DriverManager.getConnection("jdbc:sqlite:database.db");
			} catch (Exception e2) {
				conn = DriverManager.getConnection("jdbc:odbc:database");
			}
		}
	}

	public void save(String username, String password, boolean nw, String FName, String LName) throws SQLException {
		String stmt1 = "SELECT id FROM Users WHERE ID = ?";
		PreparedStatement ps = conn.prepareStatement(stmt1);
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			System.out.println("Username is already taken");
			return;
		}

		String stmt2 = "INSERT INTO Users VALUES (?, ?, ?, ?, ?)";
		PreparedStatement ps2 = conn.prepareStatement(stmt2);
		ps2.setString(1, username);
		ps2.setString(2, password);
		ps2.setString(3, FName);
		ps2.setString(4, LName);
		ps2.setInt(5, 0);
		ps2.executeUpdate();
	}

	public User findById(String id) throws SQLException {
		String stmt = "SELECT id, FName, LName, Password FROM Users WHERE ID = ?";
		PreparedStatement ps = conn.prepareStatement(stmt);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			String username = rs.getString("id");
			String FName = rs.getString("FName");
			String LName = rs.getString("LName");
			String password = rs.getString("Password");
			// Create and return User object using retrieved data
			return new User(username, password, FName, LName);
		} else {
			return null; // User not found
		}
	}

	public void updatePassword(String username, String newPassword) throws SQLException {
		String stmt = "UPDATE Users SET Password = ? WHERE ID = ?";
		PreparedStatement ps = conn.prepareStatement(stmt);
		ps.setString(1, newPassword);
		ps.setString(2, username);
		int rowsAffected = ps.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Password updated successfully");
		} else {
			System.out.println("Failed to update password");
		}
	}

	public boolean isValid(String id, String password) {
		// Check if id and password match in the database
		return false;
	}

	public void disCon() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getFName(String id) {
		// Method to get first name by id
		return null;
	}

	public String getLName(String id) {
		// Method to get last name by id
		return null;
	}

	public void add(String id, String password, String fName, String lName) {
		// Method to add user
	}
}
