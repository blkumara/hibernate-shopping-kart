package com.ty.shopping.controller;

import com.ty.shopping.service.ProductService;

public class DeleteProduct {
		public static void main(String[] args) {
			ProductService productService=new  ProductService();
			boolean product=productService.deleteProductById(3);
			if(product!=false)
			{
				System.out.println("Deleted SuccesFully");
			}
			else {
				System.out.println("Product is Not Found");
			}
		}
}
