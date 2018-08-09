package accp.com.spring4.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import accp.com.spring4.pojo.User;
import accp.com.spring4.service.UserService;

@Controller
public class UserController {
	

	@ResponseBody
	@RequestMapping(value = "/subLogin", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public String subLogin(User users) {

		
			// 获得主体
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(users.getUserName(), users.getUserPwd());
			 try {
				 
				 subject.login(token);
				 
			 } catch (AuthenticationException e) {
					 
					 return e.getMessage();
					 
				 }
			

			if (subject.hasRole("老板")) {
				return "有老板权限";
			}
		return "无老板权限";

	}

	// @RequiresPermissions("admin:find")注解里放权限数组
	// 只有角色admin才能访问
	//@RequiresRoles("老板")
	@RequiresPermissions(value={"admin:insert","user:insert"},logical=Logical.OR)//多个权限满足一个就好
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	@ResponseBody
	public String roles() {
		return "sesscue";
	}

	@RequiresPermissions("admin:delete")
	@RequestMapping(value = "/roles1", method = RequestMethod.GET)
	@ResponseBody
	public String roles1() {
		return "sesscue1";
	}
}
