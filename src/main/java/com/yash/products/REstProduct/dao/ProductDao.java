package com.yash.products.REstProduct.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.products.REstProduct.beans.Product;
import com.yash.products.REstProduct.repo.ProductRepository;
import com.yash.products.REstProduct.repo.ProductRepositoryFinal;

@Service
public class ProductDao implements ProductRepositoryFinal{

	@Autowired
	ProductRepository productRepository;

	@Override
	public Optional<Product> findProductById(Integer id) {
		Optional<Product> p=productRepository.findById(id);
		System.out.println(p.get().getProductName());
		return p;
	}

	@Override
	public boolean addProduct(Product p) {
		System.out.println(p.getProductName());
		productRepository.save(p);
		return false;
	}

	@Override
	public Product updateProductById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> li=new ArrayList<>();
		Iterator<Product> itr=productRepository.findAll().iterator();
		while(itr.hasNext()){
			li.add(itr.next());
		}
		return li;
	}

	
	
}
