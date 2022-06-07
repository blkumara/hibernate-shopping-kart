package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class SaveUser {
public static void main(String[] args) {
	
	User user = new User();
	UserService  service=new  UserService();

	user.setName("pava");
	user.setEmail("pavan@gmail.com");
	user.setPhone(7411145744l);
	user.setPassword("pavan7411");
	
		UserService service1 = new UserService();
		service1.saveUser(user);
		
		System.out.println("Done");
}
}
