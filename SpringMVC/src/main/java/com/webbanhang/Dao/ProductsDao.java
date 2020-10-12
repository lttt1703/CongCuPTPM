package com.webbanhang.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webbanhang.Entity.MapperProducts;
import com.webbanhang.Entity.Products;

@Repository
public class ProductsDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Products> GetDataProducts() {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM product";
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
}
