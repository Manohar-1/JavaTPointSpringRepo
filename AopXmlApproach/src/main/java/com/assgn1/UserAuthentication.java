package com.assgn1;

import java.util.HashMap; 

public class UserAuthentication {
    
	public static HashMap<String,String> userData = new HashMap<>(); 
	
	static {
		userData.put("manohar@gmail.com","Manohar@1");
	}
	public boolean authenticate(String email,String password) {
          	if(userData.get(email)!=null && userData.get(email).equals(password)) {
          		return true;
          	}else {
          		return false;
          	}
	} 
	
	public String register(String email,String password) throws Exception {
		if(userData.get(email)!=null) {
			throw new Exception("Email already exists"); 
		}
		
		userData.put(email, password);
		return "user registered successfully";
	}
	
}
