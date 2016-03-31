package com.xs.spring.study.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.xs.spring.study.mvc.entry.User;
import com.xs.spring.study.mvc.service.UserService;

public class UserController extends AbstractController {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<User> users=userService.findList();
		return new ModelAndView("userList","users",users);
	}

}
