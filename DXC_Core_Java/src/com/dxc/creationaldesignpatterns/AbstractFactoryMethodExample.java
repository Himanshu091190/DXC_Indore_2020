package com.dxc.creationaldesignpatterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/****************** 1st Phase of Creatig Classes and Interface  ***********************************/
interface MyTreatment {
	String getHospitalName();
}

class Apollo implements MyTreatment{
	String strHospitalName;
	public Apollo() {
		strHospitalName = "Apollo";
	}
	public String getHospitalName() {
		return strHospitalName;
	}
}

class Fortis implements MyTreatment{
	String strHospitalName;
	public Fortis() {
		strHospitalName = "Fortis";
	}
	public String getHospitalName() {
		return strHospitalName;
	}
}

/************************* 2nd Phase where Abstract Factory is created  ************************************/
abstract class AbstractHospitalFactory {
	public abstract MyTreatment getHospital(String strHospital);
}

class HospitalFactory extends AbstractHospitalFactory {
	@Override
	public MyTreatment getHospital(String strHospital) {
		if(strHospital == null)
			return null;
		if(strHospital.equalsIgnoreCase("Apollo"))
			return new Apollo();
		if(strHospital.equalsIgnoreCase("Fortis"))
			return new Fortis();
		return null;
	}
}

/********************* 3rd Phase Where we are calling the Factories and their Methods  ******************/
public class AbstractFactoryMethodExample {
	public static void main(String[] args) throws Exception{
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Hospital\nApollo\nFortis");
		String strHospital = buff.readLine();
		HospitalFactory mObject = new HospitalFactory();
		MyTreatment mTreatment = mObject.getHospital(strHospital);
		System.out.println("Hospital Name is "+mTreatment.getHospitalName());
	}
}

