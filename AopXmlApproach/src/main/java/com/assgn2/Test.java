package com.assgn2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext; 

public class Test {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("logging-config.xml");  
		
		MyService m1 = (MyService)a.getBean("myService"); 
		String abc = m1.myMethod(5000.00); 
		System.out.println(abc); 
	}
	
}
