package com.webbanhang.API.Admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import com.webbanhang.Entity.Products;
import com.webbanhang.Service.User.HomeServiceImpl;

@RestController(value = "AdminProductAPI")
public class ProductAPI {
	
	@Autowired
	HomeServiceImpl homeService = new HomeServiceImpl();
	
	@GetMapping("/api/product/{id}")
	public Products getProduct(@PathVariable String id) {
		
		Products product = homeService.GetProductById(id);
		return product;
	}
	
	@GetMapping("/api/product")
	public List<Products> getAllProduct() {
		
		List<Products> list = new ArrayList<Products>();
		list = homeService.GetDataProducts();
		return list;
	}
	
	@PostMapping("/api/product")
	public Products createProduct(@RequestBody Products product) {
		
		int count = homeService.AddProduct(product);
		if (count > 0) {
			return product;
		}	
		return null;
	}
	
	@PutMapping("/api/product")
	public Products updateProduct(@RequestBody Products product) {
		int count = homeService.EditProduct(product);
		if (count > 0) {
			return product;
		}	
		return null;
	}
	
	@DeleteMapping("/api/product")
	public void deleteProduct(@RequestBody String[] ids) {
		for(String id : ids) {
			homeService.DeleteProduct(id);
		}
	}

}
