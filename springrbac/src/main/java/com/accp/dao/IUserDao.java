package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.User;

public interface IUserDao {
	
	public User queryUserWithRole(@Param("userName")String userName,@Param("userPwd")String userPwd);
	
}
