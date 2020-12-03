package com.webbanhang.API.Admin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webbanhang.Entity.Products;

@RestController(value = "AdminProductAPI")
public class ProductAPI {
	
	@PostMapping("/api/product")
	public Products createProduct(@RequestBody Products newProduct) {
		return newProduct;
	}
	
	@PutMapping("/api/product")
	public Products updateProduct(@RequestBody Products newProduct) {
		return newProduct;
	}
	
	@DeleteMapping("/api/product")
	public void deleteProduct(@RequestBody Products newProduct) {
		
	}

}
