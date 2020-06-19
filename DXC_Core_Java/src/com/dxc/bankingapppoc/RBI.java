package com.dxc.bankingapppoc;

import java.io.BufferedReader;

public interface RBI {
	
	public void openAccount(BufferedReader buff, Customer customer);
	public void deposit(BufferedReader buff, Customer customer);
	public void withdrawl(BufferedReader buff, Customer customer);
	public void openFD(BufferedReader buff, Customer customer);

}
