package com.dxc.oops;

// this keyword in java means it refers to the current context of a class
class BankAccount {
	int acc_no;
	String name;
	float amount;
	
	public BankAccount(int acc_no, String name, float amount) 
	{
		this.acc_no = acc_no;
		this.name = name;
		this.amount = amount;
	}
	
	void deposit(float amount) {
		this.amount = this.amount + amount;
		System.out.println(amount+" deposited in account");
	}
	
	void  withdrawl(float amt) {
		if(amount < amt)
			System.out.println("Insufficient Funds in accounts");
		else
		{
			amount = amount - amt;
			System.out.println(amt+" withdrawn and balance is "+amount);
		}
	}
	
	void checkBalance() {
		System.out.println("Balance is "+amount);
	}
	
	void displayAccountDetails() {
		System.out.println(acc_no+" , "+name+" , "+amount);
	}
}

public class CustomerAccount {
	public static void main(String[] args) {
		BankAccount mBankAccount = new BankAccount(635241, "Rajat", 2000);
		mBankAccount.displayAccountDetails();
		mBankAccount.checkBalance();
		mBankAccount.deposit(50000);
		mBankAccount.checkBalance();
		mBankAccount.withdrawl(25000);
		mBankAccount.checkBalance();
	}
}
