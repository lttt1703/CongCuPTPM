package com.webbanhang.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperNSX implements RowMapper<NSX>{

	public NSX mapRow(ResultSet rs, int rowNum) throws SQLException {
		NSX n = new NSX();
		n.setId(rs.getInt("id"));
		n.setName(rs.getString("name"));
		n.setAddress(rs.getString("address"));
		n.setPhone(rs.getString("phone"));
		return n;
	}

}
