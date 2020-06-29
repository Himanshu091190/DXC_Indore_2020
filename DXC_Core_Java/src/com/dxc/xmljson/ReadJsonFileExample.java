package com.dxc.xmljson;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJsonFileExample {

	public static void main(String[] args) throws Exception {

		File mFile = new File("C:\\Users\\lenovo\\Desktop\\jsonfile.json");
		FileReader mReader = new FileReader(mFile);

		JSONParser mJsonParser = new JSONParser();
		JSONObject mJsonObject = (JSONObject) mJsonParser.parse(mReader);

		long id = (long) mJsonObject.get("id");
		System.out.println("Id is " + id);

		String name = (String) mJsonObject.get("name");
		System.out.println("Name is " + name);

		JSONArray mJsonArray = (JSONArray) mJsonObject.get("skills");
		for (int i = 0; i < mJsonArray.size(); i++) {
			JSONObject mJsonInnerObject = (JSONObject) mJsonArray.get(i);
			System.out.println("Technology is " + mJsonInnerObject.get("technology") + "\nExperience is "
					+ mJsonInnerObject.get("experience"));
		}

		JSONObject mProfession = (JSONObject) mJsonObject.get("profession");
		System.out.println("Role is " + mProfession.get("role") + "\nCountry is " + mProfession.get("country"));
	}
}
