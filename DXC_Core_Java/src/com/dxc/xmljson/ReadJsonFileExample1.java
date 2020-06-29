package com.dxc.xmljson;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJsonFileExample1 {

	public static void main(String[] args) throws Exception {
		File mFile = new File("C:\\Users\\lenovo\\Desktop\\example_2.json");
		FileReader mReader = new FileReader(mFile);

		JSONParser mJsonParser = new JSONParser();
		JSONObject mJsonObject = (JSONObject) mJsonParser.parse(mReader);
		
		JSONObject mQuizObject = (JSONObject) mJsonObject.get("quiz");
		
		// Parsing Sport Object
		JSONObject mSportObject = (JSONObject) mQuizObject.get("sport");
		JSONObject mQ1Object = (JSONObject) mSportObject.get("q1");
		System.out.println("Question is "+(String) mQ1Object.get("question"));
		JSONArray mJsonOptionsArray = (JSONArray) mQ1Object.get("options");
		for(int i=1; i<=mJsonOptionsArray.size(); i++)
			System.out.println(i+". "+(String) mJsonOptionsArray.get(i-1));
		System.out.println("Answer is "+(String) mQ1Object.get("answer"));
		
		
		
		// Parsing Maths Object
		JSONObject mMathsObject = (JSONObject) mQuizObject.get("maths");
		
		// Parsing Question 1 Object
		JSONObject mMathsQ1Object = (JSONObject) mMathsObject.get("q1");
		System.out.println("Question is "+(String) mMathsQ1Object.get("question"));
		JSONArray mMathsQ1JsonOptionsArray = (JSONArray) mMathsQ1Object.get("options");
		for(int i=1; i<=mMathsQ1JsonOptionsArray.size(); i++)
			System.out.println(i+". "+(String) mMathsQ1JsonOptionsArray.get(i-1));
		System.out.println("Answer is "+(String) mMathsQ1Object.get("answer"));
		
		// Parsing Question 2 Object
		JSONObject mMathsQ2Object = (JSONObject) mMathsObject.get("q2");
		System.out.println("Question is "+(String) mMathsQ2Object.get("question"));
		JSONArray mMathsQ2JsonOptionsArray = (JSONArray) mMathsQ2Object.get("options");
		for(int i=1; i<=mMathsQ2JsonOptionsArray.size(); i++)
			System.out.println(i+". "+(String) mMathsQ2JsonOptionsArray.get(i-1));
		System.out.println("Answer is "+(String) mMathsQ2Object.get("answer"));
	}

}
