package com.accp.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Curriculum;
import com.accp.springmvc.entity.Users;
import com.accp.springmvc.serivce.CurriculumSerivce;

@Controller
@RequestMapping("/api/curriculum")
public class CurriculumApiController {

	@Autowired
	public CurriculumSerivce curriculumSerivce;
	
	@ResponseBody
	@RequestMapping("/selectCurriculum")
	public List<Curriculum> selectCurriculum(HttpSession session) {
	Users user=	(Users) session.getAttribute("user");
		return curriculumSerivce.selectCurriculum(user.getUserId());
	}
}
