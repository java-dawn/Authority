package com.study.dawn.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dawn.dao.UserDao;
import com.study.dawn.entity.User;
import com.study.dawn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByName(String username) {

		
		System.out.println();
		Map map = new HashMap<>();

		return userDao.getUserByName(username);
	}

}
