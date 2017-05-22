package com.study.dawn.dao;

import org.springframework.stereotype.Repository;

import com.study.dawn.entity.User;

@Repository
public interface UserDao {
	public User getUserByName(String username);
}
