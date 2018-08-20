package com.accp.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springmvc.entity.Dtnum;
import com.accp.springmvc.entity.Timu;
import com.accp.springmvc.entity.Users;
import com.accp.springmvc.serivce.ChapterSerivce;
import com.accp.springmvc.serivce.DtnumSerivce;
import com.accp.springmvc.serivce.KnowledgepointSerivce;
import com.accp.springmvc.serivce.TimuSerivce;

@Controller
@RequestMapping("/timu")
public class TimuController {

	@Autowired
	public TimuSerivce timuSerivce;
	@Autowired
	public ChapterSerivce chapterSerivce;
	

	@Autowired
	public KnowledgepointSerivce knowledgepointSerivce;
	
	@RequestMapping("/chapter/{chapterId}")
	public String selectChapter(@PathVariable int chapterId,Model model,HttpSession session) {
		Users user=	(Users) session.getAttribute("user");
		List<Timu> timu=this.timuSerivce.selectChapter(chapterId,user.getUserId());
		model.addAttribute("ti",timu);
		model.addAttribute("chapter", this.chapterSerivce.selectChapterId(chapterId));

		return "daTi";
	}
	@RequestMapping("/knowledgepoint/{knowledgePointId}")
	public String selectKnowledgepoint(@PathVariable int knowledgePointId,Model model,HttpSession session) {
		Users user=	(Users) session.getAttribute("user");
		List<Timu> timu=this.timuSerivce.selectKnowledgepoint(knowledgePointId, user.getUserId());
		model.addAttribute("ti",timu);
		model.addAttribute("knowledgepoint", this.knowledgepointSerivce.selectOne(knowledgePointId));
		return "daTi";
	}
	
}
