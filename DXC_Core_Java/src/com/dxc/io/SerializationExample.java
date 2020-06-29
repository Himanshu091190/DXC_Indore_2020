package com.dxc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class DXCEmployee implements Serializable {
	int empID;
	String empName; 
//	transient String empAddress;
	String empAddress;
	public DXCEmployee(int empID, String empName, String empAddress) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}
}


public class SerializationExample {

	public static void main(String[] args) throws Exception{
		
		/****************  Serialization Implementation  *******************************************/
		// Creating the Object of Serializable Class
			DXCEmployee mObject = new DXCEmployee(101, "Rohit sharma", "Mumbai");
			DXCEmployee mObject1 = new DXCEmployee(102, "Ishant Sharma", "Delhi");
			DXCEmployee mObject2 = new DXCEmployee(103, "Virender Sehwag", "Delhi");
			DXCEmployee mObject3 = new DXCEmployee(104, "MS Dhoni", "Ranchi");
			DXCEmployee mObject4 = new DXCEmployee(105, "Yuvraj Singh", "Chandigarh");
			
			List<DXCEmployee> mList = new ArrayList<DXCEmployee>();
			mList.add(mObject);
			mList.add(mObject1);
			mList.add(mObject2);
			mList.add(mObject3);
			mList.add(mObject4);
			
			// We will write the object in a File
			FileOutputStream  mFout = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\DXC_EMP.txt");
			ObjectOutputStream mOut = new ObjectOutputStream(mFout);
			mOut.writeObject(mList);
			mOut.flush();
			mOut.close();
			System.out.println("Object written Successfully in file");
		
		/****************  De-Serialization Implementation  *******************************************/
		FileInputStream mFin = new FileInputStream("C:\\Users\\lenovo\\Desktop\\DXC_EMP.txt");
		ObjectInputStream mIn = new ObjectInputStream(mFin);
		List<DXCEmployee> mList1 = (ArrayList<DXCEmployee>) mIn.readObject();
		for(DXCEmployee mObject11: mList1)
		System.out.println("ID: "+mObject11.empID+"\nName: "+mObject11.empName+"\nAddress: "+mObject11.empAddress);
		mIn.close();
	}
}
