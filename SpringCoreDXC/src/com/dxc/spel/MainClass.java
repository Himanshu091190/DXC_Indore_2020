package com.dxc.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class MainClass {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		StandardEvaluationContext context = new StandardEvaluationContext(calculator);
		
		ExpressionParser parser = new SpelExpressionParser();
		
		/********************  Expressions in SPEL  *****************************/
		
		// String and String with Concat Expression
//		Expression exp = parser.parseExpression("'Welcome to DXC Technologies'.concat('!!')");
//		String message = (String) exp.getValue();
//		System.out.println(message);
		
		// String to byte array in expression
//		Expression exp = parser.parseExpression("'Welcome to DXC Technologies'.bytes");
//		byte[] bytes = (byte[]) exp.getValue();
//		for(int i=0; i<bytes.length; i++)
//			System.out.println(bytes[i]+" ");
		
		// Convert String to UpperCase
//		Expression exp = parser.parseExpression("'Welcome to DXC Technologies'.toUpperCase()");
//		String message = (String) exp.getValue();
//		System.out.println(message);
		
		
		/********************  OPERATORS IN SPEL  ***********************/
		
		// Arithmetic Operator in SPEL
//		System.out.println(parser.parseExpression("'Welcome to DXC Technologies'.concat('!!')").getValue());
//		System.out.println(parser.parseExpression("10*10/2").getValue());
//		System.out.println(parser.parseExpression("'Today is '+new java.util.Date()").getValue());
		
		// Logical Operator in SPEL
//		System.out.println(parser.parseExpression("true and true").getValue());
//		System.out.println(parser.parseExpression("true and false").getValue());
//		System.out.println(parser.parseExpression("true or true").getValue());
//		System.out.println(parser.parseExpression("true or false").getValue());
//		System.out.println(parser.parseExpression("false and false").getValue());
//		System.out.println(parser.parseExpression("false or false").getValue());
		
		// Relational Operator in SPEL
//		System.out.println(parser.parseExpression("'himanshu'.length()==8").getValue());
		
		
		/****************** Variables IN SPEL   **************************/
		parser.parseExpression("number").setValue(context, "5");
		System.out.println(calculator.square());
	}
}
