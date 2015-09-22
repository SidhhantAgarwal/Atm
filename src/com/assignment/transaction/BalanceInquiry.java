package com.assignment.transaction;

import java.util.ArrayList;
import java.util.Scanner;

import com.assignment.core.Account;
import com.assignment.core.User;
import com.assignment.main.GlobalConfig;
import com.assignment.main.MenuDisplay;

public class BalanceInquiry implements ITransactionHandler {

    Scanner scanner;

    String accountNumber;

    String exit;

    ArrayList<Account> accounts;

    @Override
    public void validate() {
	// TODO Auto-generated method stub

    }

    @Override
    public void completeTransaction(User user) {
	// TODO Auto-generated method stub

	Account account = null;
	accounts = new ArrayList<Account>();
	accounts = user.getAccounts();
	System.out.println("Choose Account");

	for (int i = 0; i < accounts.size(); i++) {
	    System.out.println(accounts.get(i).getNumber());
	}

	scanner = new Scanner(System.in);
	accountNumber = scanner.nextLine();

	for (int i = 0; i < accounts.size(); i++) {
	    if (accountNumber != null) {
		if (accountNumber.equals(accounts.get(i).getNumber())) {
		    account = accounts.get(i);

		}
	    } else if (account == null) {
		System.out.println("Invalid account number");
		completeTransaction(user);
	    }

	}

	if (account != null) {
	    System.out.println("Your balance is " + " " + account.getAvailableBalance().displayAmount());

	    System.out.println("Do you wish to continue");
	    System.out.println("1.Yes");
	    System.out.println("2.No");
	    exit = scanner.nextLine().toString();

	    if (exit != null) {
		MenuDisplay menuDisplay = new MenuDisplay();
		if (exit.equals("Yes")) {

		    menuDisplay.displayTransactionMenu(user);

		} else if (exit.equals("No")) {
		    GlobalConfig config = GlobalConfig.getInstance();
		    config.setSession(false);
		    menuDisplay.displayLogin();

		} else {
		    System.out.println("Invalid option, Logging out");
		    GlobalConfig config = GlobalConfig.getInstance();
		    config.setSession(false);
		    menuDisplay.displayLogin();

		}
	    }

	}

    }

}
