package com.assignment.core;

import com.assignment.main.GlobalConfig;

public class Amount {

    private double amount;

    public double getAmount() {
	return amount;
    }

    public void setAmount(double amount) {
	this.amount = amount;
    }

    public String displayAmount() {
	GlobalConfig config = GlobalConfig.getInstance();

	return config.getCurrencyType().getDisplayName() + amount;
    }

}
