package com.dxc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackAdviceAction {
	
	@Pointcut("execution(* Actions.*(..))")
	public void getAge(){} // pointcut name
	
//	@Before("getAge()") // applying pointcut before advice
//	@After("getAge()") // applying pointcut before advice
//	public void myadvice(JoinPoint jp) {
//		System.out.println("Concern Added");
//		System.out.println("Method signature is "+jp.getSignature());
//	}
	
	@AfterReturning(
			pointcut = "execution(* Actions.*(..))",
			returning = "result")
	public void myAdvice(JoinPoint jp, Object result){ // It is Advice (after returning Advice)
		System.out.println("Starting of After Advice");
		System.out.println("Method Signature "+jp.getSignature());
		System.out.println("Result is Advice is "+result);
		System.out.println("Ending of After Advice");
		
		System.out.println("\n==============================================\n");
	}
}
