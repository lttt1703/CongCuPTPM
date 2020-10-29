package com.webbanhang.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUsers implements RowMapper<Users>{

	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users user = new Users();
		user.setName(rs.getString("name"));
		user.setUser(rs.getString("user"));
		user.setPassword(rs.getString("password"));
		user.setEmail(rs.getString("email"));
		user.setAdmin(rs.getInt("admin"));
		return user;
	}

}
