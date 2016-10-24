package project.example.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import project.example.model.Product;

public class ProductDaoImpl {
	public Product find() {
		return new Product("p01", "Name 1", "thumb1.gif", new Date());
	}
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("p01", "Name 1", "thumb1.gif", new Date()));
		products.add(new Product("p02", "Name 2", "thumb2.gif", new Date()));
		products.add(new Product("p03", "Name 3", "thumb3.gif", new Date()));
		return products;
	}
}
