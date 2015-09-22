package com.assignment.main;

import java.util.HashMap;
import java.util.Scanner;

import com.assignment.core.User;
import com.assignment.transaction.ITransactionHandler;
import com.assignment.transaction.TransactionFactory;

public class MenuDisplay {

    private String userId;

    private String pin;

    private Scanner scanner;

    public MenuDisplay() {

	scanner = new Scanner(System.in);
    }

    public void displayLogin() {
	scanner = new Scanner(System.in);

	System.out.println("Enter your user id");
	userId = scanner.nextLine();
	System.out.println("Enter your pin");
	pin = scanner.nextLine();

	GlobalConfig config = GlobalConfig.getInstance();

	HashMap<String, User> users = config.getUsers();

	if (!config.isSession()) {
	    User user = users.get(userId);

	    if (user != null) {

		if (user.validate(pin)) {
		    config.setSession(true);

		    displayTransactionMenu(user);

		} else {
		    System.out.println("Invalid details re-enter");
		    displayLogin();

		}

	    }

	    else {
		System.out.println("Invalid details re-enter");
		displayLogin();
	    }

	}

    }

    public void displayTransactionMenu(User user) {

	GlobalConfig config = GlobalConfig.getInstance();

	if (config.isSession()) {
	    System.out.println("Welcome" + user.getUid());
	    System.out.println("1.Balance Inquiry");
	    System.out.println("2.Withdrawl");
	    System.out.println("3.Deposit");
	    System.out.println("Enter");
	    String option = scanner.nextLine();
	    TransactionFactory factory = new TransactionFactory();
	    ITransactionHandler handler = factory.getTransaction(option);
	    handler.completeTransaction(user);
	}

    }

    public String getUserId() {
	return userId;
    }

    public void setUserId(String userId) {
	this.userId = userId;
    }

    public String getPin() {
	return pin;
    }

    public void setPin(String pin) {
	this.pin = pin;
    }

}
