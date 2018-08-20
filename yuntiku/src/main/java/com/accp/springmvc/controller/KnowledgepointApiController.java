package com.accp.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Knowledgepoint;
import com.accp.springmvc.serivce.KnowledgepointSerivce;

@Controller
@RequestMapping("/api/Knowledgepoint")
public class KnowledgepointApiController {

	@Autowired
	public KnowledgepointSerivce knowledgepointSerivce;
	
	@ResponseBody
	@RequestMapping("/selectKnowledgepoint")
	public List<Knowledgepoint> selectKnowledgepoint(int chapterId){
		return this.knowledgepointSerivce.selectKnowledgepoint(chapterId);
	}
	
}
