package com.accp.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.biz.IUserBiz;
import com.accp.dao.IUserDao;
import com.accp.pojo.User;

@Service("userBiz")
public class UserBiz implements IUserBiz {

	@Autowired
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User findUser(String userName, String userPwd) {
		return userDao.queryUserWithRole(userName, userPwd);
	}

}
