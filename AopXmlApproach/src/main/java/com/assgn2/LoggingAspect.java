package com.assgn2;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
    
	public void beforeMethod(JoinPoint jp) {
		System.out.println(jp.getSignature().getName()); 
	    Object[] objArray = jp.getArgs(); 
	    
	    for(Object obj: objArray) {
	    	System.out.println("Object is :"+obj.toString());
	    } 
	}
	
	public int afterReturningMethod(JoinPoint jp) {
		System.out.println(jp.getSignature().getName()); 
		return 3;
	}
	
}
