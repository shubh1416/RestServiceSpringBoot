package com.yash.products.REstProduct.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yash.products.REstProduct.beans.Product;
import com.yash.products.REstProduct.dao.ProductDao;

@Component
public class ProductService {

	@Autowired
	ProductDao productDao;
	
public List<Product> getAllProductsList() {
		List<Product> iList=productDao.getAllProducts();
	System.out.println(iList.size());
	return iList;		

	}

	public void addNewProduct( Product product) {
		productDao.addProduct(product);
		
	}

	public Optional<Product> getProductDetailsById(Integer id) {
		Optional<Product> p=productDao.findProductById(id);
		return p;
	}

	public Product updateProductQuantity(Integer id, Integer quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteProductById(Integer id) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(id);
	}



}
