package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class GetAllByPrice {
	public static void main(String[] args) {

		ProductService productService = new ProductService();

		List<Product> list1 = productService.productGetByPrice(45000);
		if (list1.size() > 0) {
			System.out.println(list1);
		}

		else {
			System.out.println("Brand Is not Found");
		}
	}
}