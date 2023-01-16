package com.mysql.demo.service;


import org.json.JSONObject;

import com.mysql.demo.model.User;

public interface UserService {
	
	public JSONObject saveUser(User user);

	 
}
