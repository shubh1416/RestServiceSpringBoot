package com.yash.products.REstProduct.repo;

import java.util.List;
import java.util.Optional;

import com.yash.products.REstProduct.beans.Product;

public interface ProductRepositoryFinal {

	public Optional<Product> findProductById(Integer id);
	public boolean addProduct(Product p);
	public Product updateProductById(Integer id);
	public Boolean deleteProduct(Integer id);
	public List<Product> getAllProducts();
	
}
