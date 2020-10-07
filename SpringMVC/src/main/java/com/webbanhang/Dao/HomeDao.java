package com.webbanhang.Dao;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webbanhang.Entity.Banner;
import com.webbanhang.Entity.MapperBanner;

@Repository
public class HomeDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Banner> GetDataBanner(){
		List<Banner> list = new ArrayList<Banner>();
		String sql = "SELECT * FROM banner";
		list = _jdbcTemplate.query(sql, new MapperBanner());
		return list;
	}
}
