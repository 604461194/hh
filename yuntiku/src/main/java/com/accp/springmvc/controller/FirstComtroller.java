package com.accp.springmvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springmvc.entity.Semester;
import com.accp.springmvc.entity.Users;
import com.accp.springmvc.serivce.RecordSerivce;
import com.accp.springmvc.serivce.RecorddetailSerivce;
import com.accp.springmvc.serivce.SemesterSerivce;

@Controller
@RequestMapping("/firstController")
public class FirstComtroller {
	@Autowired
	public SemesterSerivce semesterSerivce; 
	
	@Autowired
	public RecordSerivce recordSerivce;
	
	@Autowired
	public RecorddetailSerivce recorddetailSerivce;
	
	@RequestMapping("/first")
	public String first(HttpSession session) {
		Users user=(Users) session.getAttribute("user");
		Semester semester=this.semesterSerivce.selectById(user.getClassesId());
		session.setAttribute("semester", semester);
		return "shouye";
	}
	
	@RequestMapping("/myHistory")
	public String myHistory() {
		return "redirect:/record/History";
	}
	
	@RequestMapping("/shuatiJilu/{recordId}")
	public String myTimu(@PathVariable int recordId,Model model) {
		model.addAttribute("recordDetail", this.recorddetailSerivce.selectAll(recordId));
		return "lookTimu";
	}
	
	@RequestMapping("/paihang")
	public String paiH(Model model) {
	List<Map<String,Object>> pai=this.recordSerivce.selectPai();
		model.addAttribute("pai",pai);
		return "paiHang";
	}
}
