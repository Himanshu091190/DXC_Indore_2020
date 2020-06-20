package com.dxc.schoolresult;

public class Student {

	String name, rollno, standard, stream;
	int marks1, marks2, marks3, marks4, marks5, totalMarks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public int getMarks4() {
		return marks4;
	}

	public void setMarks4(int marks4) {
		this.marks4 = marks4;
	}

	public int getMarks5() {
		return marks5;
	}

	public void setMarks5(int marks5) {
		this.marks5 = marks5;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Student student) {
		this.totalMarks = ((student.getMarks1()+student.getMarks2()+student.getMarks3()+
				student.getMarks4()+student.getMarks5())/5);
	}
	
	public String getResult(Student student) {
		totalMarks = student.getTotalMarks();
		if(totalMarks >= 90)
			return "A+";
		else if(totalMarks >= 80  && totalMarks < 90)
			return "A";
		else if(totalMarks >= 70  && totalMarks < 80)
			return "B+";
		else if(totalMarks >= 60  && totalMarks < 70)
			return "B";
		else if(totalMarks >= 50  && totalMarks < 60)
			return "C+";
		else if(totalMarks >= 40  && totalMarks < 50)
			return "C";
		else 
			return "D, Your Child is Fail !!";
	}
	 
}
