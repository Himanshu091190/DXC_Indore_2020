package com.dxc.creationaldesignpatterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Factory method Pattern says that just define an interface or abstract class for creating
// an object but let the subclasses decide which class to instantiate

/************* First Phase where declarations are done for classes  *******************************/
abstract class Treatment {
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int days) {
		System.out.println(days * rate);
	}
}

class Covid19 extends Treatment {
	@Override
	void getRate() {
		rate = 3000;
	}
}

class Dengue extends Treatment {
	@Override
	void getRate() {
		rate = 500;
	}
}

class Malaria extends Treatment {
	@Override
	void getRate() {
		rate = 1000;
	}
}


/*********************** 2nd Phase where Factory class is Created  *************************************/
// Factory Class to generate the objects of concrete classes based on given information
class GetTreatmentFactory {
	public Treatment getTreatment(String treatmentType) {
		if(treatmentType == null)
			return null;
		if(treatmentType.equalsIgnoreCase("Covid19"))
			return new Covid19();
		if(treatmentType.equalsIgnoreCase("Dengue"))
			return new Dengue();
		if(treatmentType.equalsIgnoreCase("Malaria"))
			return new Malaria();
		return null;
	}
}

/*************************  3rd Phase where everything is called in main  *********************/
public class FactoryMethodExample {

	public static void main(String[] args) throws Exception{
		
		GetTreatmentFactory mFactory = new GetTreatmentFactory();
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Disease for which bill needs to be generated");
		String strDisease = buff.readLine();
		System.out.println("Enter the number of days for billing");
		int days = Integer.parseInt(buff.readLine());
		
		Treatment mObject = mFactory.getTreatment(strDisease);
		System.out.println("Bill amount for Disease "+strDisease+" of "+days+" days is");
		mObject.getRate();
		mObject.calculateBill(days);
	}
}
