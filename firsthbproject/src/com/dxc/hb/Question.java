package com.dxc.hb;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	int id;
	String questionName;
	List<Answer> answers;
//	List<String> answers;
//	Set<String> mSetAnswers;
//	Map<String,String> mMapAnswers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	/*public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public Set<String> getmSetAnswers() {
		return mSetAnswers;
	}

	public void setmSetAnswers(Set<String> mSetAnswers) {
		this.mSetAnswers = mSetAnswers;
	}

	public Map<String, String> getmMapAnswers() {
		return mMapAnswers;
	}

	public void setmMapAnswers(Map<String, String> mMapAnswers) {
		this.mMapAnswers = mMapAnswers;
	}*/
	
	
}
