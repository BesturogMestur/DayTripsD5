public class User{
    private long id;
    private boolean[] clearance;
    private char password;
    private String fname;
    private String lName;
    private Booking booking;

    //will maybe to a consotur at a later time

    protected void setId(long id){
	this.id = id;
    }

    public long getId(){
	return id;
    }

    protected void setClarance(int i, Boolean b){
	clearance[i]=b;
    }

    protected boolean[] getClaramce(){
	return clearance;
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

    private void setBooking(Booking book ){
	//veit ekki enþá hvening þetta á að vika
	booking = book;
    }

    public Booking getBooking(){
	return booking;
    }

    private void setPasword(char newPw, char oldPw){
	if(this.pasword == oldPw){
	    this.pasword = newPw;
	    println("pasword updated");
	}
	else println("not the same password, pasword not updated");
    }

    package char getPasword(){
	return pasword;
    }
}
