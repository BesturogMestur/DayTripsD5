public class User{
    private Sting id;
    private char password;
    private String fName;
    private String lName;
    private Booking[] booking;
    private int countBooking;

    public User(String id, int clearance, char password, String fName, String lName){
	setId(id);
	setPassword(password);
	setFastName(FastName);
	setLastName(lastName);
	getBooking(id);
    }

    protected void setId(long id){
	this.id = id;
    }

    public String getId(){
	return id;
    }

    private void setFName(String name){
	fName = name;
    }

    public String getFName(String name){
	return fName;
    }

    private void setLName(String name){
	LName = name;
    }

    public String getFName(String name){
	return LName;
    }

    private void udateBooking(){
	setBooking();
    }	

    private void setBooking(){
	BookingController book = new BookingController();
	this.booking = book.finedBooking(this.id);
    }

    public Booking[] getBooking(){
	return this.booking;
    }

    private void setPasword(char Pw){
        this.password = pw;
    }

    package char getPasword(){
	return pasword;
    }
}
