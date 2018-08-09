package com.accp.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Users;
import com.accp.springmvc.mapper.UsersMapper;

@Service
public class UsersService {

	@Autowired
	public UsersMapper usersMapper;
	
	
	public List<Users> select(String userName) {
		return this.usersMapper.select(userName);
	}
	
	public int insert(Users user) {
		return this.usersMapper.insert(user);
	}
}
