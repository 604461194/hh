package com.accp.springmvc.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Classes;
import com.accp.springmvc.entity.Users;
import com.accp.springmvc.mapper.ClassMapper;
import com.accp.springmvc.mapper.UserMapper;

@Service
public class UserSerivce {
	@Autowired
public UserMapper userMappeer; 
	
	
	public int insert(Users user) {
		return this.userMappeer.insert(user);
	}
	
	public List<Users> login(String account,String passWord){
		return this.userMappeer.selectById(account, passWord);
	}
}
