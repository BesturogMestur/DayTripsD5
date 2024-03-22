package com.controller;

import com.model.User;
import com.model.UserInt;

public class UserController{
    UserInt user;

    public void logIn(String id, String password){
	findUser(id, password);
    }

    private void findUser(String id, String password) {
    }

    public void logOut(){
	user = null;
    }

    public void setUp(String id, String password, String fName, String lName){
	this.user.add(id, password, fName, lName);
    }

    public void delUser(String password){
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
