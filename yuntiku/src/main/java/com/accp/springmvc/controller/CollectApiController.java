package com.accp.springmvc.controller;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Collect;
import com.accp.springmvc.entity.Users;
import com.accp.springmvc.serivce.CollectService;
import com.accp.springmvc.util.DateHepler;

@Controller
public class CollectApiController {

	@Autowired
	public CollectService collectService;

	@ResponseBody
	@RequestMapping("/shoucan")
	public int selectById(HttpSession session,int subjectId,Collect collect) {
	Users user=	(Users) session.getAttribute("user");
		System.err.println(user.getUserId());
		System.err.println(subjectId);
		if(this.collectService.selectById(user.getUserId(),subjectId)!=null) {
			collect.setCollectTime(DateHepler.dateTime());
			System.err.println(DateHepler.dateTime());
			return this.collectService.updateCollect(collect);
		}else {
			collect.setCollectTime(DateHepler.dateTime());
			collect.setSubjectId(subjectId);
			collect.setUserId(user.getUserId());
			return this.collectService.insertCollect(collect);
		}
	}
}
