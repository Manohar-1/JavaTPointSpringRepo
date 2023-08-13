package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 


public class Test {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BankService b1 = (BankService)a.getBean("bankService"); 
		b1.deposit(500); 
		b1.withdraw(300);
	}
	
}
