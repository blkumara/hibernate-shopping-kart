package com.ty.shopping.controller;

import com.ty.shopping.dao.ProductDao;

public class RateProduct {
public static void main(String[] args) {
	
	ProductDao dao=new  ProductDao();
	dao.rateProduct(1, 4.5);

}
}
