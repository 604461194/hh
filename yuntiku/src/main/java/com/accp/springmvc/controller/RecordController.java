package com.accp.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springmvc.entity.Dtnum;
import com.accp.springmvc.entity.Record;
import com.accp.springmvc.entity.Recorddetail;
import com.accp.springmvc.entity.Users;
import com.accp.springmvc.serivce.DtnumSerivce;
import com.accp.springmvc.serivce.RecordSerivce;
import com.accp.springmvc.serivce.RecorddetailSerivce;
import com.accp.springmvc.util.DateHepler;

@Controller
@RequestMapping("/record")
public class RecordController {

	@Autowired
	public RecordSerivce recordSerivce;
	
	@Autowired
	public RecorddetailSerivce recorddetailSerivce;
	
	
	@RequestMapping("/History")
	public String selectRecord(HttpSession session,HttpServletRequest request) {
	Users user=	(Users) (session.getAttribute("user"));
		List<Record> listRecord= this.recordSerivce.selectMyHistory(user.getUserId());
		request.setAttribute("record", listRecord);
		return "MyHistory";
	}
	
	
	@RequestMapping("/inserta")
	public String insertRecord(Record record,String recordName1,Dtnum dtnum, HttpServletRequest request,HttpSession session) {
	String[] answer=request.getParameterValues("answer");
	String[] subjectId=request.getParameterValues("subjectId");
	String[] validity=request.getParameterValues("validity");
	
	Users user=	(Users)session.getAttribute("user");
	record.setUserId(user.getUserId());
	record.setNumber(subjectId.length);
	record.setRecordName(recordName1);
	record.setSubmitTime(DateHepler.dateTime());
	record.setAccuracy(0);
	this.recordSerivce.insertRecord(record);
	Recorddetail recorddetail=new Recorddetail();
	int yesNum=0;
	for(int i=0;i<subjectId.length;i++) {
		if(answer[i].equals(validity[i])) {
			yesNum++;
			recorddetail.setValidity(1);
		}else {
			recorddetail.setValidity(0);
		}
		recorddetail.setRecordId(record.getRecordId());
		recorddetail.setSubjectId(Integer.parseInt(subjectId[i]));
		recorddetail.setuAnswer(answer[i].toString());
		this.recorddetailSerivce.insertRecordDetail(recorddetail);
	}
	record.setAccuracy(yesNum/answer.length);
	this.recordSerivce.updateRecord(record.getAccuracy(), record.getRecordId());
	return "redirect:/firstController/first";
	}
	
}
