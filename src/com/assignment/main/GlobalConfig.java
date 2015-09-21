package com.assignment.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Currency;

import com.assignment.core.Account;
import com.assignment.core.Amount;
import com.assignment.core.User;

/**
 * Holds the logic for the initial configuration of the
 * bank. The users with some basic details are listed in a
 * file. The data from the file is read and the initial
 * settings are initialized. The class is a singleton
 * instance.
 * 
 * 
 * @author sidhhant
 *
 */
public class GlobalConfig {

    /**
     * Singleton instance of the class which will be the
     * same across the entire instance of the application.
     */
    private static GlobalConfig instance = new GlobalConfig();

    /**
     * This field will be used to check whether a user is
     * holding a valid session.
     */
    private static boolean isSession;

    /**
     * This field denotes the currency type to be used in
     * the transactions.
     */
    private static Currency currencyType;

    /**
     * The constructor made private
     */

    private GlobalConfig() {

    }

    private static ArrayList<User> users;

    /**
     * 
     * The static method which will be called to get the
     * singleton instance of the class
     * 
     * @return the instance in the form of
     *         {@link GlobalConfig}
     */
    public static GlobalConfig getInstance() {
	return instance;

    }

    /**
     * This method will load initial settings of the
     * application.
     * 
     * @throws IOException
     */
    public void loadInitialSettings() throws IOException {
	setCurrencyType(Currency.getInstance(GlobalConstants.CURRENCY_CODE));

	try {
	    users = new ArrayList<User>();
	    String userLine;
	    BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
	    while ((userLine = reader.readLine()) != null) {
		String[] userData = userLine.split(",");
		User user = new User();
		user.setUid(userData[0]);
		MessageDigest md = MessageDigest.getInstance("MD5");
		user.setPassword(md.digest(userData[1].getBytes()));

		ArrayList<Account> accounts = new ArrayList<Account>();
		ArrayList<Account> copy = new ArrayList<Account>();

		for (int i = 2; i < userData.length; i++) {
		    Account account = new Account();
		    account.setNumber(userData[i]);
		    Amount amount = new Amount();
		    amount.setAmount(1000.00);

		    account.setAvailableBalance(amount);
		    accounts.add(account);

		}

		user.setAccounts(accounts);
		users.add(user);
		accounts.clear();

	    }

	    System.out.println(users.get(1).getUid());
	} catch (FileNotFoundException | NoSuchAlgorithmException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    /**
     * The getter method for isSession field.
     * 
     * @return session in the form of boolean.
     */
    public boolean isSession() {
	return isSession;
    }

    /**
     * The setter method for isSession field.
     * 
     * @param isSession
     */
    public void setSession(boolean isSession) {
	GlobalConfig.isSession = isSession;
    }

    public Currency getCurrencyType() {
	return currencyType;
    }

    private void setCurrencyType(Currency currencyType) {
	GlobalConfig.currencyType = currencyType;
    }

    public ArrayList<User> getUsers() {
	return users;
    }

}
