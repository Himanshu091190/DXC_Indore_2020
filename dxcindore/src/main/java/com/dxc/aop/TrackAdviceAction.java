package com.dxc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackAdviceAction {
	
	@Pointcut("execution(* Actions.*(..))")
	public void getAge(){} // pointcut name
	
/*//	@Before("getAge()") // applying pointcut before advice
	@After("getAge()") // applying pointcut before advice
	public void myadvice(JoinPoint jp) {
		System.out.println("Concern Added");
		System.out.println("Method signature is "+jp.getSignature());
	}*/
	
	/*@AfterReturning(
			pointcut = "execution(* Actions.*(..))",
			returning = "result")
	public void myAdvice(JoinPoint jp, Object result){ // It is Advice (after returning Advice)
		System.out.println("Starting of After Return Advice");
		System.out.println("Method Signature "+jp.getSignature());
		System.out.println("Return Result is "+result);
		System.out.println("Ending of After Return Advice");
		
		System.out.println("\n==============================================\n");
	}*/
	
	/*@AfterThrowing(
			pointcut = "execution(* Actions.*(..))",
			throwing = "error")
	public void myAdvice(JoinPoint jp, Throwable error){ // It is Advice (after throwable Advice)
		System.out.println("Starting of After Throwing Advice");
		System.out.println("Method Signature "+jp.getSignature());
		System.out.println("Exception is "+error);
		System.out.println("Ending of After Throwing Advice");
		
		System.out.println("\n==============================================\n");
	}*/
	
	@Pointcut("execution(* Actions.*(..))")
	public void aroundPointcut(){} // pointcut defined
	
	@Around("aroundPointcut()")
	public Object myAdvice(ProceedingJoinPoint jp) throws Throwable{ // It is Around Advice
		System.out.println("Starting of Around Advice");
		Object obj = jp.proceed();
		System.out.println("Ending of Around Advice");
		System.out.println("\n===========================\n");
		return obj;
	}
}
