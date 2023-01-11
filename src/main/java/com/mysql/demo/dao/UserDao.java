package com.mysql.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysql.demo.model.User;

public interface UserDao extends JpaRepository<User, Long>{

}
