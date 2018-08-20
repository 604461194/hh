package com.accp.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springmvc.serivce.ChapterSerivce;

@Controller
@RequestMapping("/chapter")
public class ChapterController {

	@Autowired
	public ChapterSerivce chapterSerivce;
	
	
}
