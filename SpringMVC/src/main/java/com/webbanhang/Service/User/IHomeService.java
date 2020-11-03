package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Entity.Categories;
import com.webbanhang.Entity.NSX;
import com.webbanhang.Entity.Products;
import com.webbanhang.Entity.Users;

@Service
public interface IHomeService {
	@Autowired
	public List<Categories> GetDataCategories();
	@Autowired
	public List<NSX> GetDataNSX();
	@Autowired
	public List<Products> GetDataProducts();
	@Autowired
	public List<Products> GetDataProductsByCategory(String idCategory);
	@Autowired
	public List<Products> GetDataProductsById(String id);
	@Autowired
	public List<Products> GetDataProductsPaginate(int start, int limit);
	@Autowired
	public List<Categories> GetDataCategoryById(String id);
	@Autowired
	public Products GetProductById(String id);
	@Autowired
	public int AddProduct(Products product);
	@Autowired
	public int EditProduct(Products product);
	@Autowired
	public int DeleteProduct(Products product);
}
