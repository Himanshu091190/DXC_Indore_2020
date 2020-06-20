package com.dxc.schoolresult;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SchoolResult {
	InputStreamReader isr = null;
	BufferedReader buff = null;
	
	ArrayList<Student> mStudentList = new ArrayList<Student>();
	boolean studentChoice = true;

	public static void main(String[] args) throws Exception {

		SchoolResult mObject = new SchoolResult();

		mObject.isr = new InputStreamReader(System.in);
		mObject.buff = new BufferedReader(mObject.isr);
		System.out.println("Welcome to Parent Teacher Meeting Result\n\n\n");
		
		do {
			Student mStudent = new Student();
			System.out.println("Please Enter your Details");
			
			System.out.println("Enter your name\n");
			String name = mObject.buff.readLine();
			mStudent.setName(name);
			
			System.out.println("Enter your roll number\n");
			String rollno = mObject.buff.readLine();
			mStudent.setRollno(rollno);
			
			System.out.println("Enter your Class and Section\n");
			String classSection = mObject.buff.readLine();
			mStudent.setName(classSection);
			
			System.out.println("Enter your Stream\n");
			String stream = mObject.buff.readLine();
			mStudent.setStream(stream);
			
			System.out.println("Enter your 5 Subject Marks\n");
			int marks1 = Integer.parseInt(mObject.buff.readLine());
			int marks2 = Integer.parseInt(mObject.buff.readLine());
			int marks3 = Integer.parseInt(mObject.buff.readLine());
			int marks4 = Integer.parseInt(mObject.buff.readLine());
			int marks5 = Integer.parseInt(mObject.buff.readLine());
			
			mStudent.setMarks1(marks1);
			mStudent.setMarks2(marks2);
			mStudent.setMarks3(marks3);
			mStudent.setMarks4(marks4);
			mStudent.setMarks5(marks5);
			
			mStudent.setTotalMarks(mStudent);
			
			System.out.println("Result is "+mStudent.getTotalMarks());
			
			System.out.println("Do you want to Continue\n yes\n no");
			String choice = mObject.buff.readLine();
			if(choice.equalsIgnoreCase("no"))
				mObject.studentChoice = false;
			mObject.mStudentList.add(mStudent);
		} while (mObject.studentChoice);
	}
}
