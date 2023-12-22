package com.banking.service;

import com.banking.model.Banking;

public interface Bank {
	
	//Creating A Bank Account
	public Banking saveBanking(Banking banking);
	//Delete Bank Account
	void deleteBanking(long accountno);
    // Withdraw money from an account
    void withdrawMoney(long accountno, double amount);
    //transfer Money
    void transferMoney(long fromaccountno, long toaccountno, double amount);
    //check balance
	double checkBalance(long accountno, String name, String password);
	// Add money to an account
	void addMoney(long accountno, double amount, String password);
	
}
