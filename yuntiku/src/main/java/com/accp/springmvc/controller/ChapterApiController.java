package com.accp.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Chapter;
import com.accp.springmvc.serivce.ChapterSerivce;

@Controller
@RequestMapping("/api/chapter11")
public class ChapterApiController {

	@Autowired
	public ChapterSerivce chapterSerivce;
	
	@ResponseBody
	@RequestMapping("/selectChapter")
	public List<Chapter> selectChapter(int curriculumId){
		return this.chapterSerivce.selectChapter(curriculumId);
	}
	
}
