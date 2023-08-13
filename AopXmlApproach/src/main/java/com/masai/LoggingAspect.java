package com.masai;

import org.aspectj.lang.JoinPoint; 

public class LoggingAspect {

	public void beforeAdvice(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
        System.out.println("Before " + methodName + " method is called."); 
        System.out.println("Inside beforeAdvice method\n\n\n\n");
	}
	
	public void afterAdvice(JoinPoint jp) {
		String methodName = jp.getSignature().getName(); 
		System.out.println("After "+methodName+" method is called");  
		
		System.out.println("Inside afterAdvice method\n\n\n\n");
	}
	
}
