package com.model;

public interface UserInt{
    public void find(String id, char password);
    public void add(String id, String password, String fName, String lName);
    public boolean isPwValed(String password);
    public void del();
    public String getId();
    public void delUser();
}
