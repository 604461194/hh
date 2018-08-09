package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Users;

public interface UserMapper {
	
	int insert(Users user);
	
	List<Users> selectById(
			@Param("account")String account,
			@Param("passWord")String passWord);
}
