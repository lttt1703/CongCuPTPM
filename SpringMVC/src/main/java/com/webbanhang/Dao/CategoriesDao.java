package com.webbanhang.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webbanhang.Entity.Categories;
import com.webbanhang.Entity.MapperCategories;

@Repository
public class CategoriesDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Categories> GetDataCategories(){
		List<Categories> list = new ArrayList<Categories>();
		String sql = "SELECT * FROM categories";
		list = _jdbcTemplate.query(sql, new MapperCategories());
		return list;
	}
}
