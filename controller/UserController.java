class UserController{
    private User user;
    private boolean log = false;

    public void logIn(Sting id, char password){
	user = new User(id, password);
	if(user =! null){
	    log = true;
	}
    }

    public void logOut(){
	user = null;
	log = false;
    }
}
