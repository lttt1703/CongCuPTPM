package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Entity.Categories;
import com.webbanhang.Entity.Products;

@Service
public interface IHomeService {
	@Autowired
	public List<Categories> GetDataCategories();
	@Autowired
	public List<Products> GetDataProducts();
	@Autowired
	public List<Products> GetDataProductsByCategory(String idCategory);
	@Autowired
	public List<Products> GetDataProductsById(String id);
	@Autowired
	public List<Categories> GetDataCategoryById(String id);
}
