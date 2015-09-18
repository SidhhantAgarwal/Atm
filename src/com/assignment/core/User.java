package com.assignment.core;

public class User {

    private static String uid;

    private static String password;

    private static String firstName;

    private static String lastName;

    public static String getPassword() {
	return password;
    }

    public static void setPassword(String password) {
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

    public static String getUid() {
	return uid;
    }

    public static void setUid(String uid) {
	User.uid = uid;
    }

}
