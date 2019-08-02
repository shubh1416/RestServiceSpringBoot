package com.yash.products.REstProduct.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.products.REstProduct.beans.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>{

}
