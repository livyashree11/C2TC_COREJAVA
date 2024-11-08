package com.bankingsystem;

public class Bank {
	private static int totalAccounts = 0;

    // Static method to retrieve the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to increment total accounts
    public static void incrementTotalAccounts() {
        totalAccounts++;
    }
}
