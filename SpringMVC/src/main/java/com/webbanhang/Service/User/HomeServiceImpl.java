package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dao.CategoriesDao;
import com.webbanhang.Dao.ProductsDao;
import com.webbanhang.Entity.Categories;
import com.webbanhang.Entity.Products;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private CategoriesDao categoriesDao;
	@Autowired
	private ProductsDao productDao;
	
	public List<Categories> GetDataCategories() {
		return categoriesDao.GetDataCategories();
	}
	
	public List<Products> GetDataProducts() {	
		return productDao.GetDataProducts();
	}
}
