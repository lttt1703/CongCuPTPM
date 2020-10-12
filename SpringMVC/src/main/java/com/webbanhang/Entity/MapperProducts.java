package com.webbanhang.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProducts implements RowMapper<Products>{

	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		Products p = new Products();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setCategory_id(rs.getInt("category_id"));
		p.setProducer_id(rs.getInt("producer_id"));
		p.setPrice(rs.getFloat("price"));
		p.setDetail(rs.getString("detail"));
		p.setImage(rs.getString("image"));
		p.setSale(rs.getInt("sale"));
		return p;
	}

}
