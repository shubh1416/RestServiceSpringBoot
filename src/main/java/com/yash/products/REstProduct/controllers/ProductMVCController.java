/*package com.yash.products.REstProduct.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;
import com.yash.products.REstProduct.beans.Product;
import com.yash.products.REstProduct.exception.ProductNotFoundException;

@Controller
public class ProductMVCController {

	 List<Product> productList=new ArrayList<Product>();
		
		@PostMapping("/addProduct")
		public ModelAndView addProduct(@ModelAttribute("userForm") Product product, BindingResult bindingResult){
			System.out.println("Add Product request received......");
			ModelAndView model;
			if(bindingResult.hasErrors()){
				
				 model = new ModelAndView("errorMessage", bindingResult.getModel());
				return model;
			}else{
				productList.add(product);
				return new ModelAndView("productInfo", "userForm", new Product());

			}
		}
		
		@GetMapping("/getProduct/{proId}")
		public ModelAndView getProductById(@PathVariable("proId") Integer id, ModelMap model){
			ModelAndView mobj = new ModelAndView("showProducts");
			
			Optional<Product> pro=productList.stream().filter(n->n.getProductId()==id).findAny();
			
			if(pro.isPresent()){
				return mobj.addObject("lists", pro.get());
			}else
				model.put("errorMessage", "No Products found in inventory...");
			return new ModelAndView();
			
		}
		
		@PutMapping("/updateProduct/{proId}/{quantity}")
		public ModelAndView getUpdatedProductDetails(@PathVariable("proId") Integer id, @PathVariable("quantity") Integer quantity,  ModelMap model){
	Optional<Product> pro=productList.stream().filter(n->n.getProductId()==id).findAny();
	ModelAndView mobj = new ModelAndView("showProducts");			
			if(pro.isPresent()){
				pro.get().setQuantity(quantity);
				return mobj.addObject("lists", pro.get());
			}else
				model.put("errorMessage", "No Products found in inventory...");
			return new ModelAndView();
			
		}
		
		@DeleteMapping("/removeProduct/{proId}")
		public String removePtroduct(@PathVariable("proId") Integer id,ModelMap model){
			Optional<Product> pro=productList.stream().filter(n->n.getProductId()==id).findAny();
			if(pro.isPresent()){
				 productList.remove(pro.get());
			}else{
				throw new ProductNotFoundException("No Product found");
			}
			model.put("successMsg", "Product removed successfully");
			return "success";
		}
		
		@GetMapping("/getAllProduct")
		public ModelAndView getAllProducts(ModelMap model){
			ModelAndView mobj = new ModelAndView("showProducts");
			
			List<Product> res=productList;
			if(res.size()>0){
				mobj.addObject("lists", res);
				return mobj;
			}else
				model.put("errorMessage", "No Products found in inventory...");
			return new ModelAndView();
		
		}
}*/
