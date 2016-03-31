package com.xs.spring.study.mvc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.xs.spring.study.mvc.dao.UserDao;
import com.xs.spring.study.mvc.entry.User;

public class UserDaoImpl implements UserDao{

	public List<User> findList() {
		List<User> users=new ArrayList<User>();
		User user1=new User();
		user1.setAge(26);
		user1.setName("hill");
		users.add(user1);
		
		User user2=new User();
		user2.setAge(28);
		user2.setName("chexs");
		users.add(user2);
		return users;
	}

}
