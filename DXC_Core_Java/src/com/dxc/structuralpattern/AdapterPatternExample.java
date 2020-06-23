package com.dxc.structuralpattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// It converts the interface of a class into another interface that user wants and is known as Wrapper

//Step1:  Create a MenuCard Interface (Target Interface)
interface MenuCard {
	public void giveRestaurantDetails();
	public String getRestaurantNameLocation();
}

//Step2: Create a RestaurantDetails Class (Adaptee Class)
class RestaurantDetails {
	String restaurantName, ownerName;

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}

//Step 3: Create a User/Customer Class (Adapter Class)
class User extends RestaurantDetails implements MenuCard {
	@Override
	public void giveRestaurantDetails() {
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Owner Name");
			String ownerName = buff.readLine();
			System.out.println("Enter Restaurant Name");
			String restName = buff.readLine();
			setOwnerName(ownerName);
			setRestaurantName(restName);
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
		}
	}

	@Override
	public String getRestaurantNameLocation() {
		// TODO Auto-generated method stub
		String ownerName = getOwnerName();
		String restName = getRestaurantName();
		return "Owner Name is "+ownerName+", Restaurant Name and Location is "+restName;
	}
}

//Step 4: Client Class
public class AdapterPatternExample {

	public static void main(String[] args) {
		MenuCard mCard = new User();
		mCard.giveRestaurantDetails();
		System.out.println(mCard.getRestaurantNameLocation());
	}

}
