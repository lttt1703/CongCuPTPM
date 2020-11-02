package com.webbanhang.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBillDetail implements RowMapper<BillDetail>{

	public BillDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
		BillDetail bd = new BillDetail();
		bd.setId(rs.getInt("id"));
		bd.setId_product(rs.getInt("id_product"));
		bd.setId_bill(rs.getInt("id_bill"));
		bd.setQuanty(rs.getInt("quanty"));
		bd.setTotal(rs.getDouble("total"));
		return bd;
	}

}
