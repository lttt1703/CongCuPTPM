package com.webbanhang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Entity.Categories;
import com.webbanhang.Entity.Users;

@Service
public interface IAccountService {
	@Autowired
	public int AddAccount(Users user);
	@Autowired
	public Users CheckAccount(Users user);
}
