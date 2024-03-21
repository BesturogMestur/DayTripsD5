class UserController{
    private UserInt user;

    public void logIn(Sting id, char password){
	findUser(id, password);
    }

    public void logOut(){
	user = null;
    }

    public void setUp(Sring id, char password, String fName, String lName){
	this.user.add(id, password, fName, lName);
    }

    public void delUser(char password){
	if(this.user != null){
	    if(this.user.isPwValed(password)){
		this.user.delUser();
		this.user = null;
	    }
	}
    }

    public void addBooking(String type, char date){
	BookingController bC = new BookingController;
	TripController tC = new TripController;

	tC.findTrip(String type, char date);

	TripInt trip = tc.getTrip;
	StringInt Id = this.user.getId();
	bc.addBooking(id, trip);
    }
	

    public User getUser(){
	return this.user;
    }

    
}
