package com.ty.shopping.service;

import static com.ty.shopping.util.AppConstant.SECRETE_KEY;

import java.util.List;

import com.ty.shopping.dao.ProductDao;
import com.ty.shopping.dto.Product;
import com.ty.shopping.util.AES;

public class ProductService {
	ProductDao dao = new ProductDao();

	public Product saveProduct(Product product) {
		String enc = AES.encrypt(product.getDescription(), SECRETE_KEY);

		product.setDescription(enc);

		return dao.saveProduct(product);

	}

	public Product productGetById(Product product, int id) {  //boolan
		return dao.productGetById(product, id);
//		String enc=AES.decrypt(product.getDescription(),SECRETE_KEY );
//		product.setDescription(enc);

//		Product product2= dao.productGetById(product, id);
//		return product2;

	}

	public List<Product> getAllProduct() {
		return dao.getAllProduct();

	}

	public Product updateProductById(Product product, int id) {
		return dao.updateProductById(product, id);

	}

	public boolean deleteProductById(int id) {
		return dao.deleteProductById(id);
	}

	public List<Product> productGetByBrand(String brand) {
		return dao.productGetByBrand(brand);
	}

	public List<Product> productGetByPrice(double price) {
		return dao.productGetByPrice(price);
	}

	public List<Product> productGetByType(String type) {
		return dao.productGetByType(type);
	}

	public List<Product> productGetBySize(String size) {
		return dao.productGetBySize(size);
	}
	

}
