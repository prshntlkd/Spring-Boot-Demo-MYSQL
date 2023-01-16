package com.mysql.demo.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mysql.demo.model.User;

public interface UserService {
	
	public JSONPObject saveUser(User user);

}
