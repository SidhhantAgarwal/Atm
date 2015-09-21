package com.assignment.core;

import java.security.MessageDigest;
import java.util.ArrayList;

public class User {

    private static String uid;

    private static byte[] password;

    private static String firstName;

    private static String lastName;

    private static ArrayList<Account> accounts;

    public static byte[] getPassword() {
	return password;
    }

    public static void setPassword(byte[] password) {
	User.password = password;
    }

    public static String getFirstName() {
	return firstName;
    }

    public static void setFirstName(String firstName) {
	User.firstName = firstName;
    }

    public static String getLastName() {
	return lastName;
    }

    public static void setLastName(String lastName) {
	User.lastName = lastName;
    }

    public String getUid() {
	return uid;
    }

    public void setUid(String uid) {
	User.uid = uid;
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
	User.accounts = accounts;
    }

}
