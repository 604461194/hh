package com.accp.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Users;
import com.accp.springmvc.service.UsersService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UsersService usersService;
	
	@ResponseBody
	@RequestMapping("/join")
	public String select(String name,HttpSession session, Users users) {
	List<Users> user=this.usersService.select(name);
	if(user.size()==0) {
		users.setUserName(name);
		int i=this.usersService.insert(users);
	}else {
		session.setAttribute("user", user);	
	}
		return "";
	}
	
	
	@ResponseBody
	@RequestMapping("/uname")
	public List<Users> select(HttpSession session) {
		List<Users> user= (List<Users>) session.getAttribute("user");
		return user;
	}
	
	@ResponseBody
	@RequestMapping("/remove")
	public String remove(HttpSession session) {
		session.invalidate();
		System.err.println(1);
		return "";
	}
}
