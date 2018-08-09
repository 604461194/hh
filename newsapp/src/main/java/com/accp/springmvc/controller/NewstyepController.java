package com.accp.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Newstyep;
import com.accp.springmvc.service.NewstyepService;

@Controller
@RequestMapping("/type")
public class NewstyepController {

	@Autowired
	public NewstyepService newstyepService;
	
	@ResponseBody
	@RequestMapping("/all")
	public List<Newstyep> selectType(){
		System.err.println("saffg");
		return this.newstyepService.selectTypeAll();
	}
}
