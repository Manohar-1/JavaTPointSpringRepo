package com.assgn1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Scanner; 


public class SecurityAspect {
    UserAuthentication userAuthentication;

	public void setUserAuthentication(UserAuthentication userAuthentication) {
		this.userAuthentication = userAuthentication;
	} 
    
	public Object checkAuthentication(ProceedingJoinPoint jp) throws Throwable{
		Scanner sc  = new Scanner(System.in);
		System.out.println("write email and password");
		String email = sc.next(); 
		String password = sc.next();  
		
		if(userAuthentication.authenticate(email, password)) {
			return jp.proceed();
		}else {
			throw new SecurityException("Access denied: User not authenticated...");
		}
	}
    
}
