package com.assignment.transaction;

public class TransactionFactory {

    public ITransactionHandler getTransaction(String option) {

	switch (option) {
	case "1":

	    return new BalanceInquiry();

	case "2":

	    return new Withdrawl();

	case "3":

	    return new Deposit();

	default:
	    break;
	}

	return null;

    }

}
