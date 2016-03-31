package com.xs.spring.study.mvc.service.impl;

import java.util.List;

import com.xs.spring.study.mvc.dao.UserDao;
import com.xs.spring.study.mvc.entry.User;
import com.xs.spring.study.mvc.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> findList() {
		return userDao.findList();
	}

}
