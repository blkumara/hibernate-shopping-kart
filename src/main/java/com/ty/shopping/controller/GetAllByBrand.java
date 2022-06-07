package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class GetAllByBrand {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		List<Product> list = productService.productGetByBrand("Puma");
		if (list.size() > 0) {
			System.out.println(list);
		}

		else {
			System.out.println("Brand Is not Found");
		}

	}
}
