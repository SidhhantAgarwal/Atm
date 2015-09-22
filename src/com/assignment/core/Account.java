package com.assignment.core;

public class Account {

    private String number;

    private Amount availableBalance;

    public String getNumber() {
	return number;
    }

    public void setNumber(String number) {
	this.number = number;
    }

    public Amount getAvailableBalance() {
	return availableBalance;
    }

    public void setAvailableBalance(Amount availableBalance) {
	this.availableBalance = availableBalance;
    }

    public Account(String number, Amount availableBalanace) {
	this.number = number;
	this.availableBalance = availableBalanace;
    }

}
