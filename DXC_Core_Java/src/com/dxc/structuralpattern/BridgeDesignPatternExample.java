package com.dxc.structuralpattern;

import java.util.ArrayList;
import java.util.List;

// This Design Pattern Decouples the Functional abstraction from implementation


// Step 1: Create a Question Interface which provides navigation from 1 to another question and vice-versa
interface Question {
	public void nextQuestion();
	public void previousQuestion();
	public void displayQuestions();
}

// Step 2: Create a ExamQuestion class which will implements Question interface
class ExamQuestion implements Question{
	List<String> mQuestionList = new ArrayList<String>();
	int current = 0;
	
	public ExamQuestion() {
		mQuestionList.add("What is Your Name ?");
		mQuestionList.add("What is Your Age ?");
		mQuestionList.add("What is Your Weight ?");
		mQuestionList.add("What is Your Gender ?");
		mQuestionList.add("What is Your Location ?");
	}

	@Override
	public void nextQuestion() {
		if(current < mQuestionList.size()) {
			System.out.println(current);
			current++;
		}
	}

	@Override
	public void previousQuestion() {
		if(current > 0)
			current--;
	}

	@Override
	public void displayQuestions() {
		for(String questions: mQuestionList)
			System.out.println(questions);
	}
}

public class BridgeDesignPatternExample {
	public static void main(String[] args) {
		ExamQuestion mQuestions = new ExamQuestion();
		mQuestions.nextQuestion();
		mQuestions.previousQuestion();
		mQuestions.displayQuestions();
	}
}
