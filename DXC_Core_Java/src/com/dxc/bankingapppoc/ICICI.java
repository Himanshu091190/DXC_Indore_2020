package com.dxc.bankingapppoc;

import java.io.BufferedReader;

public class ICICI implements RBI{
	
	public int ROI = 4;
	public int MIN_FD_AMOUNT = 5000;
	public int MIN_YEARS = 3;
	public int MIN_BAL = 3000;
	public int BAL = MIN_BAL;
	
	@Override
	public void openAccount(BufferedReader buff) {
		try {
			System.out.println("Enter your Name");
			String name = buff.readLine();
			System.out.println("Enter your Email");
			String email = buff.readLine();
			System.out.println("Enter your Phone");
			String phone = buff.readLine();
			
			System.out.println("Congratulations your Account is Opened !!");
			System.out.println("your Details are \nName: "+name+"\nEmail: "+email+"\nPhone: "+phone);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
		}
	}

	@Override
	public void deposit(BufferedReader buff) {
		try {
			System.out.println("Enter the amount to be deposited");
			String amount = buff.readLine();
			BAL = BAL + Integer.parseInt(amount);
			System.out.println("Balance is "+BAL);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
		}
	}

	@Override
	public void withdrawl(BufferedReader buff) {
		try {
			System.out.println("Enter the amount to be Withdrawl");
			String amount = buff.readLine();
			if(BAL - Integer.parseInt(amount) > MIN_BAL)
				BAL = BAL - Integer.parseInt(amount);
			else
				System.out.println("MIN BAL is not maintained after withdrawl !!");
			System.out.println("Balance is "+BAL);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
		}
	}

	@Override
	public void openFD(BufferedReader buff) {
		try {
			System.out.println("Enter your FD amount");
			String fdamount = buff.readLine();
			System.out.println("Enter Term Duration of FD");
			String years = buff.readLine();
			if(Integer.parseInt(fdamount) > MIN_FD_AMOUNT && Integer.parseInt(years) > MIN_YEARS) {
				int TotalFDAmount = Integer.parseInt(fdamount) + (ROI*Integer.parseInt(fdamount));
				for(int i=2; i<=Integer.parseInt(years); i++)
					TotalFDAmount = TotalFDAmount + (ROI*TotalFDAmount);
				System.out.println("Your Total FD Amount after "+years+" years will be "+TotalFDAmount);
			}
				
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
		}
	}

}
