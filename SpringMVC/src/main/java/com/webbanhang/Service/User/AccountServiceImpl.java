package com.webbanhang.Service.User;

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

	public boolean CheckAccount(Users user) {
		String pass = user.getPassword();
		user = userDao.GetUserByAcc(user);
		if (user != null) {
			if (BCrypt.checkpw(pass, user.getPassword())) {
				return true;
			} else {
				return false;
			}

		}
		return false;
	}

}
