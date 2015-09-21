package com.assignment.core;

public class Account {

    private static String number;

    private static Amount availableBalance;

    public static String getNumber() {
	return number;
    }

    public static void setNumber(String number) {
	Account.number = number;
    }

    public static Amount getAvailableBalance() {
	return availableBalance;
    }

    public static void setAvailableBalance(Amount availableBalance) {
	Account.availableBalance = availableBalance;
    }

}
