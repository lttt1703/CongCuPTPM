package com.webbanhang.Service.User;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dao.CategoriesDao;
import com.webbanhang.Dao.ProductsDao;
import com.webbanhang.Entity.Categories;
import com.webbanhang.Entity.NSX;
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

	public List<Products> GetDataProductsByCategory(String idCategory) {
		return productDao.GetDataProductsByCategory(idCategory);
	}

	public List<Categories> GetDataCategoryById(String id) {
		return categoriesDao.GetDataCategoryById(id);
	}

	public List<Products> GetDataProductsById(String id) {
		return productDao.GetDataProductsById(id);
	}

	public List<Products> GetDataProductsPaginate(int start, int limit) {
		return productDao.GetDataProductsPaginate(start, limit);
	}

	public int AddProduct(Products product) {
		return productDao.AddProduct(product);
	}

	public List<NSX> GetDataNSX() {
		return categoriesDao.GetDataNSX();
	}

	public int EditProduct(Products product) {
		return productDao.EditProduct(product);
	}

	public int DeleteProduct(String id) {
		return productDao.DeleteProduct(id);
	}

	public Products GetProductById(String id) {
		return productDao.GetProductById(id);
	}
	
	public int AddCategory(Categories cate) {
		return productDao.AddCategory(cate);
	}

	public int EditCategory(Categories cate) {
		return categoriesDao.EditCategory(cate);
	}

	public int DeleteCategory(String id) {
		return categoriesDao.DeleteCategory(id);
	}
}
