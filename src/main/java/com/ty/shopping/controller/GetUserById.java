package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class GetUserById {
public static void main(String[] args) {
	UserService userService=new UserService();
	User user = userService.userGetById(2);
	if (user != null) {
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getPhone());
		System.out.println(user.getPassword());

	} else {
		System.out.println("Not Found");
	}
}
}
