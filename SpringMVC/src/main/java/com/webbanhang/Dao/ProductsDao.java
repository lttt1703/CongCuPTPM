package com.webbanhang.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webbanhang.Entity.MapperProducts;
import com.webbanhang.Entity.Products;
import com.webbanhang.Entity.Users;

@Repository
public class ProductsDao extends BaseDao{

	private String sqlString() {
		StringBuilder sql = new StringBuilder();
		sql.append("Select * From product order by id desc");
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
	
	public Products GetProductById(String id) {
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
	
	public int AddProduct(Products product) {

		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO product ");
		sql.append("( ");
		sql.append("name, ");
		sql.append("category_id, ");
		sql.append("producer_id, ");
		sql.append("price, ");
		sql.append("detail, ");
		sql.append("image, ");
		sql.append("sale) ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("'" + product.getName() + "', ");
		sql.append(" " + product.getCategory_id() + ", ");
		sql.append(" " + product.getProducer_id() + ", ");
		sql.append(" " + product.getPrice() + ", ");
		sql.append("'" + product.getDetail() + "', ");
		sql.append("'" + product.getImage() + "', ");
		sql.append(" " + product.getSale());
		sql.append(")");

		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public int EditProduct(Products product) {

		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE product SET ");
		sql.append("name='"+product.getName()+"', ");
		sql.append("category_id="+product.getCategory_id()+", ");
		sql.append("producer_id="+product.getProducer_id()+", ");
		sql.append("price="+product.getPrice()+", ");
		sql.append("detail='"+product.getDetail()+"', ");
		sql.append("image='"+product.getImage()+"', ");
		sql.append("sale="+product.getSale()+" ");
		sql.append("WHERE ");
		sql.append("id = "+product.getId());

		int update = _jdbcTemplate.update(sql.toString());
		return update;
	}
	
	public int DeleteProduct(Products product) {

		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO product ");
		sql.append("( ");
		sql.append("name, ");
		sql.append("category_id, ");
		sql.append("producer_id, ");
		sql.append("price, ");
		sql.append("detail, ");
		sql.append("image, ");
		sql.append("sale) ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("'" + product.getName() + "', ");
		sql.append(" " + product.getCategory_id() + ", ");
		sql.append(" " + product.getProducer_id() + ", ");
		sql.append(" " + product.getPrice() + ", ");
		sql.append("'" + product.getDetail() + "', ");
		sql.append("'" + product.getImage() + "', ");
		sql.append(" " + product.getSale());
		sql.append(")");

		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
}
