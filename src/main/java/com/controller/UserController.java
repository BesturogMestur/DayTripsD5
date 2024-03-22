package com.controller;

import com.model.User;
import com.model.UserInt;

public class UserController{
    private UserInt user;

    public void logIn(String id, char password){
	findUser(id, password);
    }

    private void findUser(String id, char password) {
    }

    public void logOut(){
	user = null;
    }

    public void setUp(String id, char password, String fName, String lName){
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

    public User getUser(){
	    return (User) this.user;
    }
}
