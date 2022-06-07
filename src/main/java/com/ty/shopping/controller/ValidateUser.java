package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class ValidateUser {
	 public static void main(String[] args) {
		UserService userService=new UserService();
			User user =userService.validateUser("kumara@gmail.com", "varun9844");
			if(user != null) {
				System.out.println("Name: "+user.getName());
				System.out.println("Email: "+user.getEmail());
				System.out.println("Phone:"+user.getPhone());
			}
			else {
				System.out.println("Email id and password not matching please check.....");
			}
	}
}
