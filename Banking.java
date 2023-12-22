package com.banking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banking {
	
	@Id
	private long accountno;
	private String name;
	private String password;
	private String confirm_Psw;
	private double amount;
	private String address;
	private long mobile_No;
	public Banking() {
		super();
		
	}
	public Banking(long accountno, String name, String password, String confirm_Psw, double amount, String address,
			long mobile_No) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.password = password;
		this.confirm_Psw = confirm_Psw;
		this.amount = amount;
		this.address = address;
		this.mobile_No = mobile_No;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_Psw() {
		return confirm_Psw;
	}
	public void setConfirm_Psw(String confirm_Psw) {
		this.confirm_Psw = confirm_Psw;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(long mobile_No) {
		this.mobile_No = mobile_No;
	}
	@Override
	public String toString() {
		return "Banking [accountno=" + accountno + ", name=" + name + ", password=" + password + ", confirm_Psw="
				+ confirm_Psw + ", amount=" + amount + ", address=" + address + ", mobile_No=" + mobile_No + "]";
	}
	 //retrieve the balance directly from the 'amount' field
    public double getBalance() {
        return amount;
    }

    //update the 'amount' field directly
    public void setBalance(double newBalance) {
        this.amount = newBalance;
    }


}
