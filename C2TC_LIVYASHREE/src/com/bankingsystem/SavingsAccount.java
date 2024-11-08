package com.bankingsystem;

public class SavingsAccount extends Account {
	 private static final double INTEREST_RATE = 0.02;

	    public SavingsAccount(double initialBalance) {
	        super(initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            balance += balance * INTEREST_RATE; // Add interest on deposit
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance for withdrawal.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }

}
