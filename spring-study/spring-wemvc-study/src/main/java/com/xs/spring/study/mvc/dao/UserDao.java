package com.xs.spring.study.mvc.dao;

import java.util.List;

import com.xs.spring.study.mvc.entry.User;

public interface UserDao {
	List<User> findList();
}
