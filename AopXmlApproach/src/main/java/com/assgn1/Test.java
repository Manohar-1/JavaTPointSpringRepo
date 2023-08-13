package com.assgn1;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext2.xml"); 
		SecureDataService s = (SecureDataService)a.getBean("secureDataService"); 
		
		s.viewData(); 
		s.updateData();
	}
}
