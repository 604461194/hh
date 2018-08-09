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
@SuppressWarnings("all")
public class PageAction {

	@RequestMapping(value = "/chufang")
	public String goToChufang() {
		return "chufang";
	}

	@RequestMapping(value = "/guahao")
	public String goToGuahao() {
		return "guahao";
	}

	@RequestMapping(value = "/huajia")
	public String goToHuajia() {
		return "huajia";
	}

	@RequestMapping(value = "/index")
	public String goToIndex() {
		return "index";
	}

	@RequestMapping(value = "/juese")
	public String goToJuese() {
		return "juese";
	}

	@RequestMapping(value = "/shoufei")
	public String goToShoufei() {
		return "shoufei";
	}

	@RequestMapping(value = "/yonghu")
	public String goToYonghu() {
		return "yonghu";
	}

}
