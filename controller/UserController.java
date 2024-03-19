class UserController{
    //Have to fix this so we can use the Database to update this.
    private void updatePasword(char newPw, char oldPw){
	if(this.pasword == oldPw){
	    this.pasword = newPw;
	    println("pasword updated");
	}
	else println("not the same password, pasword not updated");
    
}
