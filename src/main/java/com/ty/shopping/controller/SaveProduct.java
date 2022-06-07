package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class SaveProduct {
	public static void main(String[] args) {

		Product product = new Product();
		ProductService productService = new ProductService();

		product.setName("watch");
		product.setBrand("Boat");
		product.setPrice(2000);
		product.setType("Smart");
		product.setSize("null");
		product.setRating(4.5);
		product.setDescription("Boat Watch Is Good");

		System.out.println("Done");
	}

}
