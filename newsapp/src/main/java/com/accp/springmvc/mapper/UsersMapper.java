package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Users;

public interface UsersMapper {
	List<Users> select(@Param("userName")String userName);
	
	int insert(Users user);
}
