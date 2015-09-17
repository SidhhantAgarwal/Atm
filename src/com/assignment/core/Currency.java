package com.assignment.core;

public class Currency {

    private static String Type;

    private double amount;

    public double getAmount() {
	return amount;
    }

    public void setAmount(double amount) {
	this.amount = amount;
    }

    public static String getType() {
	return Type;
    }

    public static void setType(String type) {
	Type = type;
    }

}
