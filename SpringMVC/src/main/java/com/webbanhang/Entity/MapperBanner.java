package com.webbanhang.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBanner implements RowMapper<Banner>{

	public Banner mapRow(ResultSet rs, int rowNum) throws SQLException {
		Banner bn = new Banner();
		bn.setId(rs.getInt("id"));
		bn.setImg(rs.getString("img"));
		bn.setCaption(rs.getString("caption"));
		bn.setContent(rs.getString("content"));
		return null;
	}

}
