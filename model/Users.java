public class User{
    private Sting id;
    private char password;
    private String fName;
    private String lName;
    private Booking[] booking;

    public User(String id, char password){
	UserTable table = new UserTable;
	if(table.isValied(id, password)){
	    this.id = id;
	    this.password = password;
	    getName(table);
	}
	table.discon();
    }

    public User(String id, char password, boolean nw, String fName, String lname){
	UserTable table = new UserTable;
	table.saveUser(id, password, nw, fName, lName);
        this.id = id;
	this.password = password;
	this.fName = fName;
	this.lName = lName;
	this.booking = null;
	table.discon();
    }

    private void getName(table){
	//gera seina.
    }

    protected void setId(long id){
	this.id = id;
    }

    public String getId(){
	return id;
    }

    protected void setFName(String name){
	fName = name;
    }

    public String getFName(String name){
	return fName;
    }

    protected void setLName(String name){
	LName = name;
    }

    public String getFName(String name){
	return LName;
    }

    private void udateBooking(){
	setBooking();
    }	

    private void setBooking(){
	BookTable table = new BookTable;
	this.Booking = table.getBooking(this.id);
	table.disConn();
    }

    public Booking[] getBooking(){
	return this.booking;
    }

     //Have to fix this so we can use the Database to update this.
    private void updatePasword(char newPw, char oldPw){
	if(this.pasword == oldPw){
	    this.pasword = newPw;
	    println("pasword updated");
	}
	else println("not the same password, pasword not updated");
    }
    
    private void setPasword(char Pw){
        this.password = pw;
    }

    package char getPasword(){
	return pasword;
    }
}
