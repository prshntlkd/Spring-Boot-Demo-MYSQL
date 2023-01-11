package com.mysql.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.demo.dao.UserDao;
import com.mysql.demo.model.User;

@RestController
@RequestMapping("/user")
public class HomeController {
	
	@Autowired
	private UserDao userDao;
	

	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {
		
		userDao.save(user);
		
		return "user saved successfully";
	}
	
	@GetMapping("/getUser")
	public List<User> getUser() {
		
		List<User> user = userDao.findAll();
		
		user.stream()
          .map(x -> x.getName())
          .forEach(System.out::println);
		
		return  user;
		
	}
	
	@GetMapping("/getUser/{userId}")
	public User getUserById(@PathVariable long userId) {
		
		Optional<User> user = userDao.findById(userId);
		User user1 = user.get();
		System.out.println(user1.getName());
		
		return userDao.findById(userId).get();
		
	}
}
