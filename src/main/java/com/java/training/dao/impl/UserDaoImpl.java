package com.java.training.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.training.dao.UserDao;
import com.java.training.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	static Map<String,User> list = new HashMap<String,User>();
	static int counter = 0;

	@Override
	public void saveUser(User user) {
		counter++;
		user.setUserId(counter);
		list.put(user.getName(), user);
		
	}

	@Override
	public User authenticaUser(String name, String password) {
		if(list.containsKey(name)) {
			if(list.get(name).getPassword().equals(password)) {
				return list.get(name);
			}
		}
		return null;
	}

}
