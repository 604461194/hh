package com.accp.biz;

import com.accp.pojo.User;

public interface IUserBiz {

	/**
	 * 
	 * @title: findUser
	 * @description: 根据用户名，密码检索用户
	 * @param userName
	 * @param userPwd
	 * @return
	 */
	public User findUser(String userName, String userPwd);
}
