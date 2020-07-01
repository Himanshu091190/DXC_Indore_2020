package com.dxc.xmljson;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

class DXCEmployee {
	String empName, empId;
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
}

public class JsonDBExample {

	public static void main(String[] args) throws Exception{
		List<DXCEmployee> mList = new ArrayList<DXCEmployee>();
		
		File mFile = new File("C:\\Users\\lenovo\\Desktop\\dxc_employee.json");
		FileReader mReader = new FileReader(mFile);

		JSONParser mJsonParser = new JSONParser();
		JSONObject mJsonObject = (JSONObject) mJsonParser.parse(mReader);
		
		JSONArray EmployeeArray = (JSONArray) mJsonObject.get("DXC_Employee");
		for(int i=0; i<EmployeeArray.size(); i++) {
			DXCEmployee mObject = new DXCEmployee();
			JSONObject mJsonInnerObject = (JSONObject) EmployeeArray.get(i);
			mObject.setEmpId((String) mJsonInnerObject.get("id"));
			mObject.setEmpName((String) mJsonInnerObject.get("name"));
			
			mList.add(mObject);
		}
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcemployeedb", "root", "root");

		for(int i=0; i<mList.size(); i++) {
			DXCEmployee mObject = mList.get(i);
			/**********************  Inserting Into DataBase  ***************************/
			PreparedStatement stmtInsert = con.prepareStatement("insert into dxcemployee values(?,?)");
			stmtInsert.setString(1, mObject.getEmpId());
			stmtInsert.setString(2, mObject.getEmpName());	
		}
		
	}

}
