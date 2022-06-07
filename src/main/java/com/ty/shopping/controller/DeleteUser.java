package com.ty.shopping.controller;

import com.ty.shopping.service.UserService;

public class DeleteUser {
	public static void main(String[] args) {
		UserService userService = new UserService();
		Boolean user1 = userService.deleteUserById(7);
		if (user1 != false) {
			System.out.println("Deleted Successfully");
		} else {
			System.out.println("Please enter valid id");
		}
	}
}
