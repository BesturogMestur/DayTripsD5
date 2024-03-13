import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class BookingTable{
    private Connection conn;

    public BookingTable(){
	getConn();
    }

    private void getCon() throws Exception{
	try{
	    Class.forName("org.postgresql.Driver");
	    java.util.Properties props = new java.util.Properties();
	    props.setProperty("user",args[0]);
	    props.setProperty("password",args[1]);
	    conn = DriverManager.getConnection("jdbc:postgresql:database",props);
	}
	catch(Exception e){
	    try{
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:database.db");
	    }
	    catch(Exception e2){
		conn = DriverManager.getConnection("jdbc:odbc:database");
	    }
	}
    }
    
    public void save(Booking b){
	//I will do this lataer
    }

    public Booking findById(int id, Stirng type, char day){
	//I wil do this later
    }

    public void update(Booking b){
	//I will do this later
    }

    public void delete(int id, Stirng type, char day){
	//I will do this later
    }
}
