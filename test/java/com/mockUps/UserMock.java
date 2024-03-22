package com.mockUps;

class Usermock implements UserInt{
    private String id;
    private char password;
    private String fName;
    private String lName;
    private BookingInt[] Booked;
    private UserTableInt table;

    public void find(String id, char password){
	this.table.conn;
	if(isValed(id, password)){
	    this.id = id;
	    this.password = password;
	    setValuse();
	}
	this.table.disConn;

	if(id != null){
	    setBooking();
	}
    }

    private boolean isValed(Sting id, char password){
	return this.table.isPwValed(id, password);
    }

    private void setvalue(){
	fName = this.table.getFName(this.id);
	lName = this.table.getLName(this.id);
    }

    private void setBooking(){
	BookingTableInt bT = new BookingTableInt;
	bT.conn();
	booked = bT.getUserBooking(this.id);
	bT.disConn();
    }

    public void add(Sring id, char password, String fName, String lName){
	this.table.conn();
	this.table.add(id, password, fName, lName);
	this.table.disConn();
    }
}
