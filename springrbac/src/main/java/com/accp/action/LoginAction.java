package com.accp.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.IUserBiz;
import com.accp.pojo.User;

@Controller
@RequestMapping("/login")
public class LoginAction {

	@Autowired
	private IUserBiz userBiz;

	@RequestMapping("loginIn")
	public String loginIn(Model model, User user, HttpSession session)
			throws Exception {
		String viewName = null;
		user = userBiz.findUser(user.getUserName(), user.getUserPwd());
		if (user != null) {
			session.setAttribute("USER", user);
			viewName = "redirect:/index?fcode=0";
		} else {
			viewName = "../../public/login";
			model.addAttribute("msg", "用户名或密码错误");
		}
		return viewName;
	}

	@RequestMapping("loginOut")
	public String loginOut(HttpSession session) throws Exception {
		session.removeAttribute("USER");
		session.invalidate();// 立即失效
		return "redirect:/public/login.jsp";
	}

}
