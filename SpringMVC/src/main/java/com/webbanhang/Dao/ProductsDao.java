package com.webbanhang.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webbanhang.Entity.MapperProducts;
import com.webbanhang.Entity.Products;

@Repository
public class ProductsDao extends BaseDao{

	private String sqlString() {
		StringBuilder sql = new StringBuilder();
		sql.append("Select * From product ");
		sql.append("Order by RAND()");
		return sql.toString();
	}
	
	public List<Products> GetDataProducts() {
		List<Products> list = new ArrayList<Products>();
		String sql = sqlString();
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
	
	public List<Products> GetDataProductsByCategory(String idCategory) {
		List<Products> list = new ArrayList<Products>();
		String sql = "Select * from product where category_id = "+ idCategory;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}

	public List<Products> GetDataProductsById(String id) {
		List<Products> list = new ArrayList<Products>();
		String sql = "Select * from product where id = "+ id;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
	
	public Products GetProductById(int id) {
		Products product = new Products();
		String sql = "Select * from product where id = "+ id;
		product = _jdbcTemplate.queryForObject(sql, new MapperProducts());
		return product;
	}

	public List<Products> GetDataProductsPaginate(int start, int limit) {
		List<Products> list = new ArrayList<Products>();
		String sql = "Select * from product limit "+ start + ", "+ limit;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
	
}
