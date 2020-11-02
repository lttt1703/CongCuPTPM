package com.webbanhang.Dao;

import org.springframework.stereotype.Repository;

import com.webbanhang.Entity.BillDetail;
import com.webbanhang.Entity.Bills;

@Repository
public class BillsDao extends BaseDao {

	public int AddBill(Bills bill) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO bills ");
		sql.append("( ");
		sql.append("user, ");
		sql.append("address, ");
		sql.append("phone, ");	
		sql.append("total, ");
		sql.append("quanty, ");
		sql.append("note ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("'"+bill.getUser()+"', ");
		sql.append("'"+bill.getAddress()+"', ");
		sql.append("'"+bill.getPhone()+"', ");
		sql.append(" "+bill.getTotal()+", ");
		sql.append(" "+bill.getQuanty()+", ");
		sql.append("'"+bill.getNote()+"' ");
		sql.append(")");
		
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public int GetIDLastBill() {
		StringBuffer sql = new StringBuffer();
		sql.append("Select Max(id) from bills;");
		int id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Integer.class);
		return id;
	}
	
	public int AddBillDetail(BillDetail billDetail) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO billdetail ");
		sql.append("( ");
		sql.append("id_product, ");
		sql.append("quanty, ");
		sql.append("total, ");
		sql.append("id_bill ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append(" "+ billDetail.getId_product()+", ");
		sql.append(" "+ billDetail.getQuanty()+", ");
		sql.append(" "+ billDetail.getTotal()+", ");
		sql.append(" "+ billDetail.getId_bill()+" ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
}
