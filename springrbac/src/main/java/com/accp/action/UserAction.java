package com.accp.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.pojo.Function;
import com.accp.pojo.User;

@Controller
@RequestMapping("/user")
@SuppressWarnings("all")
public class UserAction {

	@RequestMapping(value = "getFunTree")
	@ResponseBody
	public List getUserFunTree(HttpSession session) {
		// 从session获得用户，以便得到权限
		User user = (User) session.getAttribute("USER");
		List tree = new ArrayList();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Function fun : user.getRole().getFunctions()) {
			menuNames.add(fun.getParentFun().getFname());
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Function fun : user.getRole().getFunctions()) {
				// 匹配是否是当前菜单的子项
				if (name.equals(fun.getParentFun().getFname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", fun.getFid());
					n.put("text", fun.getFname());
					// 给节点追加自定义属性
					Map<String, Object> attr = new HashMap<String, Object>();
					attr.put("furl", fun.getFurl());
					attr.put("fpid", fun.getFpid());
					n.put("attributes", attr);
					n.put("iconCls", "icon-sum");// 节点图标
					nodeChild.add(n);
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}

	@RequestMapping(value = "getSessionUser")
	@ResponseBody
	public User getUserInfo(HttpSession session) throws Exception {
		User user = (User) session.getAttribute("USER");
		return user;
	}

}
