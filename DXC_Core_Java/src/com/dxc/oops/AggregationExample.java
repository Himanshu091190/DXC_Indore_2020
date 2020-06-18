package com.dxc.oops;

// Aggregation and Composition Example
class DosaSnack {
	String color, type, price;
	Recepie mRecepie;

	void displayMenu() {
		color = "Brown Golden Color, ";
		type = "South Indian Type, ";
		price = " INR 120/- Price, ";
		System.out.println(color+price+type);
		mRecepie = new Recepie();
		// Aggregation Example
		mRecepie.displayRecepie();
		
		// Composition Example
		mRecepie.setData("Data 1", "Data 2", "Data 3", "Data 4");
	}
}

class Recepie {
	String pepper, onion, garlic, potato;

	void displayRecepie() {
		pepper = "1 tbsp pepper, ";
		onion = "2 onions mashed, ";
		garlic = "1 tbsp garlic, ";
		potato = "2 potatoes mashed";
		System.out.println(pepper + onion + garlic + potato);
	}
	
	void setData(String pepper, String onion, String garlic, String potato) {
		this.pepper = pepper;
		this.onion = onion;
		this.garlic = garlic;
		this.potato = potato;
		System.out.println(pepper + onion + garlic + potato);
	}
}

public class AggregationExample {
	public static void main(String[] args) {
		DosaSnack mDosaSnack = new DosaSnack();
		mDosaSnack.displayMenu();
	}
}
