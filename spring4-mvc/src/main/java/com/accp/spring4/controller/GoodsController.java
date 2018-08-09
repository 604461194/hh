package com.accp.spring4.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class GoodsController {

	@RequestMapping("/select")
	public String select() {
		return "index";
	}
}
