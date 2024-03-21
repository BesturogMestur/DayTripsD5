class UserController{
    private User user;

    public User logIn(Sting id, char password){
	user = new User(id, password);
	if(user =! null){
	    log = true;
	}
	return this.user;
    }

    public void logOut(){
	user = null;
    }

    public void setUp(Sring id, char password, String fName, String lName){
	this.user = new user(id, password, fName, lName);
	if (this.user != null){
	    this.log = true;
	}
    }

    public void delUser(char password){
	if(log){
	    if(this.user.isPwValed(password)){
		this.user.delUser();
		this.user = null;
		this.log = false;
	    }
	}
    }

    public void addBooking(String type, char date){
	BookingController bC = new BookingController;
	TripController tC = new TripController;

	tC.findTrip(String type, char date);

	Trip trip = tc.getTrip;
	String Id = this.user.getId;
	bc.addBooking(id, trip);
    }
	

    public User getUser(){
	return this.user;
    }

    
}
