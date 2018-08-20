package com.accp.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Semester;
import com.accp.springmvc.serivce.SemesterSerivce;

@Controller
@RequestMapping("/api/semester")
public class SemesterApiController {

	@Autowired
	public SemesterSerivce semesterSerivce;
	
	@ResponseBody
	@RequestMapping("/semester")
	public List<Semester> selectSemester(){
		return this.semesterSerivce.selectAll();
	}
}
