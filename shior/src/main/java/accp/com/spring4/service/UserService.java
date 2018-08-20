package accp.com.spring4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import accp.com.spring4.mapper.UserMapper;
import accp.com.spring4.pojo.User;

@Service
public class UserService {

	@Autowired
	public UserMapper userMapper;
	
	public List<User> findUser(String userName){
		return this.userMapper.findUser(userName);
	}
}
