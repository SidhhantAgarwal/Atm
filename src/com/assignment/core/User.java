package com.assignment.core;

import java.security.MessageDigest;
import java.util.ArrayList;

public class User {

    private String uid;

    private byte[] password;

    private String firstName;

    private String lastName;

    private ArrayList<Account> accounts;

    public byte[] getPassword() {
	return password;
    }

    public void setPassword(byte[] password) {
	this.password = password;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getUid() {
	return uid;
    }

    public void setUid(String uid) {
	this.uid = uid;
    }

    public boolean validate(String pin) {

	try {
	    MessageDigest md = MessageDigest.getInstance("MD5");
	    return MessageDigest.isEqual(md.digest(pin.getBytes()), password);
	} catch (Exception e) {
	    System.err.println("error, caught exeption : " + e.getMessage());
	    return false;
	}

    }

    public ArrayList<Account> getAccounts() {
	return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
	this.accounts = accounts;

    }

    @Override
    public Object clone() {

	User user = new User();
	user.setUid(this.getUid());
	user.setPassword(this.getPassword());
	user.setAccounts(this.getAccounts());
	return user;
    }

}
