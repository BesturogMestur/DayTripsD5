package com.data;

import java.sql.*;
import java.time.LocalDate;
import com.model.Trip;
import com.model.Booking;

public class BookingTable {
	private Connection conn;

	public BookingTable(String[] args) throws Exception {
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

	public void save(Booking b) {
		try {
			PreparedStatement statement = conn.prepareStatement("INSERT INTO Booking (ID, trip, tripDate) Values (?, ?, ?)");
			statement.setString(1, b.getUserId());
			statement.setString(2, b.getTrip());
			statement.setDate(3, Date.valueOf(b.getTripDate()));
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Booking findById(int id, String tripName, LocalDate tripDate) {
		try {
			PreparedStatement statement = conn.prepareStatement("SELECT * FROM Booking WHERE ID = ? AND trip = ? AND tripDate = ?");
			statement.setInt(1, id);
			statement.setString(2, tripName);
			statement.setDate(3, Date.valueOf(tripDate));
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				Trip trip = new Trip(tripName, rs.getString("location"), tripDate, null); // Assuming you have a constructor for Trip
				return new Booking(rs.getString("ID"), trip);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	public void update(Booking b) {
		try{
			PreparedStatement statement= conn.prepareStatement("UPDATE Booking SET trip = ?, tripDate = ? WHERE ID = ?");
			statement.setString(1, b.getTrip());
			statement.setDate(2, Date.valueOf(b.getTripDate()));
			statement.setString(3, b.getUserId());
			statement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id, String trip, LocalDate tripDate) {
		try{
			PreparedStatement statement = conn.prepareStatement("DELETE FROM Booking WHERE ID = ? AND trip = ? AND tripDate = ?");
			statement.setString(1, String.valueOf(id));
			statement.setString(2,trip);
			statement.setDate(3,Date.valueOf(tripDate));

		}catch (SQLException e){
			e.printStackTrace();
		}

	}

	public void add(String id, Trip trip) {
	}

	public void disCon() {
	}

	public void del(String id, Trip trip) {
	}

	public boolean ifContensBooking(String id, String type, char date) {
		return false;
	}

	public boolean ifContentsBooking(String id, String type, char date) {
		return false;
	}
}
