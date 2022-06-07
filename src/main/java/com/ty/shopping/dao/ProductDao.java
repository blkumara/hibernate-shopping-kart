package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.Product;
import com.ty.shopping.dto.User;

public class ProductDao {

	public Product saveProduct(Product product) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;

	}

	public Product productGetById(Product product1, int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product product = entityManager.find(Product.class, id);
		return product;

	}

	public List<Product> getAllProduct() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "SELECT p from Product p";

		Query query = entityManager.createQuery(sql);
		return query.getResultList();

	}

	public Product updateProductById(Product product, int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		return product;

	}

	public boolean deleteProductById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product product = entityManager.find(Product.class, id);
		if (product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			return true;
		} else {

			return false;
		}
	}

	public List<Product> productGetByBrand( String brand) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("SELECT p from Product p where p.brand=?1");
		query.setParameter(1, brand);
		return query.getResultList();

	}

	public List<Product> productGetByPrice( double price) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("SELECT p from Product p where p.price= ?1");
		query.setParameter(1, price);
		return query.getResultList();

	}

	public List<Product> productGetByType( String type) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("SELECT p from Product p where p.type=?1");
		query.setParameter(1, type);
		return query.getResultList();

	}

	public List<Product> productGetBySize(String size) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("SELECT p from Product p where p.size=?1");
		query.setParameter(1, size);
		return query.getResultList();

	}
	public void rateProduct(int id , double rating)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product product=entityManager.find(Product.class, id);
		int nou=product.getNoOfUser();
		double rt=product.getRating()*nou;
		nou++;
		product.setNoOfUser(nou);
		double r=(rt+rating)/nou;
		product.setRating(r);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		
		
	}
	

}
