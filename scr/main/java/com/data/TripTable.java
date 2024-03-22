package com.data;

import com.model.Pay;
import com.model.Trip;
import com.model.User;

import java.sql.Connection;
import java.sql.DriverManager;

public class TripTable{
    private Connection conn;

    public TripTable() throws Exception {
	getCon();
    }

	public void getCon() throws Exception{
		try{
	    	Class.forName("org.postgresql.Driver");
	    	java.util.Properties props = new java.util.Properties();
	    	props.setProperty("user", "User_name");
	    	props.setProperty("password", "User_Password");
	    	conn = DriverManager.getConnection("jdbc:postgresql:database",props);
		}
		catch(Exception e){
	    	try {
				Class.forName("org.sqlite.JDBC");
				conn = DriverManager.getConnection("jdbc:sqlite:database.db");
			}catch(Exception e2){
				conn = DriverManager.getConnection("jdbc:odbc:database");
	    	}
		}
    }
    
    public void save(Trip t){
	//I will do this lataer
    }

    public User findById(String type, char day){
	//I will do this later
		return null;
	}

    public void update(Trip t){
	//I will do this later
    }

    public void delete(String type, char day){
	//I will do this later
    }

	public boolean exict(String type, char date) {
		return false;
	}

	public void disCon() {
	}

	public String getlocation(String type, char date) {
		return type;
	}

	public Pay getPrice(String type, char date) {
		return null;
	}

	public void add(String type, String location, char date, Pay price) {
	}

	public void del(String type, char date) {
	}
}
