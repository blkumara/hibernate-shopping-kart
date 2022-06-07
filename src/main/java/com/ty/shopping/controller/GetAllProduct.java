package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class GetAllProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		List<Product> list=productService.getAllProduct();
		System.out.println(list);
	}

}
