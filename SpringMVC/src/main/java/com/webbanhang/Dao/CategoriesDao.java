package com.webbanhang.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webbanhang.Entity.Categories;
import com.webbanhang.Entity.MapperCategories;
import com.webbanhang.Entity.MapperProducts;
import com.webbanhang.Entity.Products;

@Repository
public class CategoriesDao extends BaseDao{
	
	public List<Categories> GetDataCategories(){
		List<Categories> list = new ArrayList<Categories>();
		String sql = "SELECT * FROM categories";
		list = _jdbcTemplate.query(sql, new MapperCategories());
		return list;
	}
	
	public List<Categories> GetDataCategoryById(String id) {
		List<Categories> list = new ArrayList<Categories>();
		String sql = "Select * from categories where id = "+ id;
		list = _jdbcTemplate.query(sql, new MapperCategories());
		return list;
	}
}
