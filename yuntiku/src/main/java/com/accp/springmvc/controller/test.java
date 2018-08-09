package com.accp.springmvc.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

	@RequestMapping("/test1")
	public String test() {
		return "WEB-INF/yuntk/test.html";
	}
	@RequestMapping("/test2")
	public String select(HttpServletRequest request) {
		Collection<Part> parts = ((Object) request).getParts();
		
		
		return "";
	}
}
