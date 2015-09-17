package com.assignment.core;

public class Transaction {

    /**
     * 
     */
    private static Account toAccount;

    /**
     * 
     */
    private static Account fromAccount;

    private static Currency amount;

    public static Account getToAccount() {
	return toAccount;
    }

    public static void setToAccount(Account toAccount) {
	Transaction.toAccount = toAccount;
    }

    public static Account getFromAccount() {
	return fromAccount;
    }

    public static void setFromAccount(Account fromAccount) {
	Transaction.fromAccount = fromAccount;
    }

    public static Currency getAmount() {
	return amount;
    }

    public static void setAmount(Currency amount) {
	Transaction.amount = amount;
    }

}
