package com.dxc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackAdviceAction {
	/******************************   ADVICES FOR ACTION  CLASS  ***************************************************/
	
	/*@Pointcut("execution(* Customer.*(..))")
	public void getAge(){} // pointcut name
	
//	@Before("getAge()") // applying pointcut before advice
	@After("getAge()") // applying pointcut before advice
	public void myadvice(JoinPoint jp) {
		System.out.println("Concern Added");
		System.out.println("Method signature is "+jp.getSignature());
	}
	
	@AfterReturning(
			pointcut = "execution(* Customer.*(..))",
			returning = "result")
	public void myAdvice(JoinPoint jp, Object result){ // It is Advice (after returning Advice)
		System.out.println("Starting of After Return Advice");
		System.out.println("Method Signature "+jp.getSignature());
		System.out.println("Return Result is "+result);
		System.out.println("Ending of After Return Advice");
		
		System.out.println("\n==============================================\n");
	}
	
	@AfterThrowing(
			pointcut = "execution(* Customer.*(..))",
			throwing = "error")
	public void myAdvice(JoinPoint jp, Throwable error){ // It is Advice (after throwable Advice)
		System.out.println("Starting of After Throwing Advice");
		System.out.println("Method Signature "+jp.getSignature());
		System.out.println("Exception is "+error);
		System.out.println("Ending of After Throwing Advice");
		
		System.out.println("\n==============================================\n");
	}
	
	@Pointcut("execution(* Actions.*(..))")
	public void aroundPointcut(){} // pointcut defined
	
	@Around("aroundPointcut()")
	public Object myAdvice(ProceedingJoinPoint jp) throws Throwable{ // It is Around Advice
		System.out.println("Starting of Around Advice");
		Object obj = jp.proceed();
		System.out.println("Ending of Around Advice");
		System.out.println("\n===========================\n");
		return obj;
	}*/
	
	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	
	
	/******************************************************************   ADVICES FOR CUSTOMER CLASS    ********************************************/
	
	@Pointcut("execution(* Customer.*(..))")
	public void openAccount(){} // pointcut name
	
	@Before("openAccount()") // applying pointcut before advice
	public void openAccountBeforeAdvice(JoinPoint jp) {
		System.out.println("Calling open Account Before Advice");
	}
	@After("openAccount()") // applying pointcut before advice
	public void openAccountAfterAdvice(JoinPoint jp) {
		System.out.println("Calling open Account After Advice");
	}
	
	@AfterReturning(pointcut = "execution(* Customer.*(..))", returning = "result")
	public void getBalanceAfterReturnAdvice(JoinPoint jp, Object result){ // It is Advice (after returning Advice)
		System.out.println("Starting of After Return Advice");
		System.out.println("Return Result is "+result);
		System.out.println("Ending of After Return Advice");
	}
	
	@AfterThrowing(pointcut = "execution(* Customer.*(..))",throwing = "error")
	public void myAdvice(JoinPoint jp, Throwable error){ // It is Advice (after throwable Advice)
		System.out.println("Starting of After Throwing Advice");
		System.out.println("Exception is "+error);
		System.out.println("Ending of After Throwing Advice");
	}
	
	@Pointcut("execution(* Customer.*(..))")
	public void aroundPointcut(){} // pointcut defined
	
	@Around("aroundPointcut()")
	public Object depositAndWithdrawlAroundPointCutAdvice(ProceedingJoinPoint jp) throws Throwable{ // It is Around Advice
		System.out.println("Starting of Around Advice");
		Object obj = jp.proceed();
		System.out.println("Ending of Around Advice");
		return obj;
	}	
	
}
