package com.yash.products.REstProduct.controllers;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yash.products.REstProduct.beans.Product;
import com.yash.products.REstProduct.exception.ProductNotFoundException;
import com.yash.products.REstProduct.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService pService;
		
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody @Valid Product product, BindingResult bindingResult){
		System.out.println("Add Product request received......");
		if(bindingResult.hasErrors()){
			throw new ProductNotFoundException(bindingResult.getFieldError().toString());
		}else{
			pService.addNewProduct(product);
		}
		return "Product  added successfully";
	}
	
	@GetMapping("/getProduct/{proId}")
	public Product getProductById(@PathVariable("proId") Integer id){

		Optional<Product> pro=pService.getProductDetailsById(id);
		
		if(pro.isPresent()){
			return pro.get();
		}else
			throw new ProductNotFoundException("No Product found");
	}
	
	@PutMapping("/updateProduct/{proId}/{quantity}")
	public Product getUpdatedProductDetails(@PathVariable("proId") Integer id, @PathVariable("quantity") Integer quantity){
	
		return pService.updateProductQuantity(id,quantity);		
	
	}
	
	@DeleteMapping("/removeProduct/{proId}")
	public String removePtroduct(@PathVariable("proId") Integer id){
		Boolean isDeleted=pService.deleteProductById(id);		
	if(isDeleted)
		return "Product removed successfully";
	else
		return "Product not found ";

	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProducts(){
		return pService.getAllProductsList();
		
	}
}
