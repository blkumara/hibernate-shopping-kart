package com.ty.shopping.service;

import static com.ty.shopping.util.AppConstant.SECRETE_KEY;

import java.util.List;

import javax.persistence.Query;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;
import com.ty.shopping.util.AES;

public class UserService {
	UserDao userDao = new UserDao();

	public User saveUser(User user) {
		
		String enc1 = AES.encrypt(user.getEmail(), SECRETE_KEY);
		String enc2 = AES.encrypt(user.getPassword(), SECRETE_KEY);

		
		user.setEmail(enc1);
		user.setPassword(enc2);

		return userDao.saveUser(user);
	}

	public User userGetById(int id) {
		User user =userDao.userGetById(id);
		String dec = AES.decrypt(user.getEmail(), SECRETE_KEY);
		String dec1 = AES.decrypt(user.getPassword(), SECRETE_KEY);
		user.setEmail(dec);
		user.setPassword(dec1);
		
		return user;
	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public User validateUser(String email, String password) {
		return userDao.validateUser(email, password);
	}

	public boolean deleteUserById(int id) {
		return userDao.deleteUserById(id);
	}
}
