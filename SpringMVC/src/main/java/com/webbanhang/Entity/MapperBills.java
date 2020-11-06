package com.webbanhang.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBills implements RowMapper<Bills>{

	public Bills mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bills b = new Bills();
		b.setId(rs.getInt("id"));
		b.setUser(rs.getString("user"));
		b.setPhone(rs.getString("phone"));
		b.setAddress(rs.getString("address"));
		b.setTotal(rs.getDouble("total"));
		b.setQuanty(rs.getInt("quanty"));
		b.setNote(rs.getString("note"));
		return b;
	}

}
