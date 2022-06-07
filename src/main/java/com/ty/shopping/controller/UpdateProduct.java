package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class UpdateProduct {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		Product product = new Product();
		product.setId(2);
		product.setName("Laptop");
		product.setBrand("HP");
		product.setPrice(65000);
		product.setType("Gaming");
		product.setSize("null");
		product.setRating(4);
		product.setDescription("Hp Laptop Is Best");
		// productService.updateProductById(product, 5);
		productService.updateProductById(product, 2);
		System.out.println("Updated");
	}
}
