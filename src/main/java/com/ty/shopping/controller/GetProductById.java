package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class GetProductById {
	
	public static void main(String[] args) {
		Product product1=new Product();
		ProductService productService=new ProductService();
		Product product=productService.productGetById(product1, 3);
		if(product!=null)
		{
			System.out.println("Id is :"+product.getId());
			System.out.println("Name is :"+product.getName());
			System.out.println("Brand is :"+product.getBrand());
			System.out.println("Price is :"+product.getPrice());
			System.out.println("Type is :"+product.getType());
			System.out.println("Size is :"+product.getSize());
			System.out.println("Rating is :"+product.getRating());
			System.out.println("Description is :"+product.getDescription());
		}
		else {
			System.out.println(" Product is not found  ");
		
		}
	}

}
