package com.dxc.bankingapppoc;

public class Customer {
	
	int operationCounter, OpenAccountCounter, DepositCounter, WithdrawlCounter, OpenFDCounter;
	String name,email,phone,balance, bankType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public int getOperationCounter() {
		return operationCounter;
	}

	public void setOperationCounter(int operationCounter) {
		this.operationCounter = operationCounter;
	}

	public int getOpenAccountCounter() {
		return OpenAccountCounter;
	}

	public void setOpenAccountCounter(int openAccountCounter) {
		OpenAccountCounter = openAccountCounter;
	}

	public int getDepositCounter() {
		return DepositCounter;
	}

	public void setDepositCounter(int depositCounter) {
		DepositCounter = depositCounter;
	}

	public int getWithdrawlCounter() {
		return WithdrawlCounter;
	}

	public void setWithdrawlCounter(int withdrawlCounter) {
		WithdrawlCounter = withdrawlCounter;
	}

	public int getOpenFDCounter() {
		return OpenFDCounter;
	}

	public void setOpenFDCounter(int openFDCounter) {
		OpenFDCounter = openFDCounter;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
}
