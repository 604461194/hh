package com.accp.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springmvc.entity.Users;
import com.accp.springmvc.serivce.UserSerivce;
import com.accp.springmvc.util.DateHepler;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserSerivce userSerivce;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(Users user) {
		user.setRegisterTime(DateHepler.dateTime());
		this.userSerivce.insert(user);
		return "login";
	}
	@RequestMapping("/doLogin")
	public String doLogin(String account,String passWord,HttpSession session){
		Users user= this.userSerivce.login(account, passWord).get(0);
		session.setAttribute("user", user);
		return "redirect:/firstController/first";
	}
	
}
