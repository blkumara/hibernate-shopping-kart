package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class GetAllUser {
public static void main(String[] args) {
	UserService service= new UserService();
	List<User> list=service.getAllUsers();
	if(list != null)
	{
		System.out.println(list);

	}
	else
		System.out.println("no data");
	
}
}
