package com.webbanhang.Service.User;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webbanhang.Dao.UsersDao;
import com.webbanhang.Entity.Users;

@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
	UsersDao userDao = new UsersDao();

	public int AddAccount(Users user) {

		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));

		return userDao.AddAccount(user);
	}

	public Users CheckAccount(Users user) {
		String pass = user.getPassword();
		user = userDao.GetUserByAcc(user);
		if (user != null) {
			if (BCrypt.checkpw(pass, user.getPassword())) {
				return user;
			} else {
				return null;
			}

		}
		return null;
	}

	public List<Users> GetDataUsers() {
		// TODO Auto-generated method stub
		return userDao.GetDataUsers();
	}

	public Users CheckAccountAdmin(Users user) {
		String pass = user.getPassword();
		user = userDao.GetAdminByAcc(user);
		if (user != null) {
			if (pass.equals(user.getPassword())) {
				return user;
			} else {
				return null;
			}

		}
		return null;
	}

}
