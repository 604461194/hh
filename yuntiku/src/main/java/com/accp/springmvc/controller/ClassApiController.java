package com.accp.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Classes;
import com.accp.springmvc.serivce.ClassSerivce;

@Controller
@RequestMapping("/api")
public class ClassApiController {
	@Autowired
	public ClassSerivce classSerivce;
	
	
	
	@ResponseBody
	@RequestMapping("/selectclass")
	public List<Classes> selectAll(){
		return this.classSerivce.selectAll();
	}
	
}
