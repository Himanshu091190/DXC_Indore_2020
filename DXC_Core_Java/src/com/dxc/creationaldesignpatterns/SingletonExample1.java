package com.dxc.creationaldesignpatterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

class Accountant {
	public void addStudent(BufferedReader buff, Connection con) {
	}

	public void editStudent(BufferedReader buff, Connection con) {
	}

	public void deleteStudent(BufferedReader buff, Connection con) {
	}
}

public class SingletonExample1 {

	static Connection conn;
	static BufferedReader buff;

	public static Connection getConnectionInstance() throws Exception {
		if(conn == null)
			return conn = DriverManager.getConnection("");
		else
			return conn;
	}

	public static BufferedReader getBufferInstance() throws Exception {
		if(buff == null)
			return buff = new BufferedReader(new InputStreamReader(System.in));
		else
			return buff;
	}

	public static void main(String[] args) throws Exception {
		Accountant mObject = new Accountant();
		mObject.addStudent(getBufferInstance(), getConnectionInstance());
		mObject.editStudent(getBufferInstance(), getConnectionInstance());
		mObject.deleteStudent(getBufferInstance(), getConnectionInstance());

	}
}
