package com.webbanhang.Dao;

import org.springframework.stereotype.Repository;

import com.webbanhang.Entity.MapperUsers;
import com.webbanhang.Entity.Users;

@Repository
public class UsersDao extends BaseDao {

	public int AddAccount(Users user) {

		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO users ");
		sql.append("( ");
		sql.append("user, ");
		sql.append("password, ");
		sql.append("name, ");
		sql.append("email, ");
		sql.append("admin) ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("'" + user.getUser() + "', ");
		sql.append("'" + user.getPassword() + "', ");
		sql.append("'" + user.getName() + "', ");
		sql.append("'" + user.getEmail() + "', ");
		sql.append(user.getAdmin() + " ");
		sql.append(")");

		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}

	public Users GetUserByAcc(Users user) {
		String sql = "SELECT * FROM users WHERE user = '" + user.getUser() + "'";
		Users result = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		return result;
	}

}