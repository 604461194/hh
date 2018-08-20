package com.accp.springmvc.entity;

public class Recorddetail {
private int recordDetailId;
private int subjectId;
private String uAnswer;
private int recordId;
private int validity;
public int getRecordDetailId() {
	return recordDetailId;
}
public void setRecordDetailId(int recordDetailId) {
	this.recordDetailId = recordDetailId;
}
public int getSubjectId() {
	return subjectId;
}
public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}
public String getuAnswer() {
	return uAnswer;
}
public void setuAnswer(String uAnswer) {
	this.uAnswer = uAnswer;
}
public int getRecordId() {
	return recordId;
}
public void setRecordId(int recordId) {
	this.recordId = recordId;
}
public int getValidity() {
	return validity;
}
public void setValidity(int validity) {
	this.validity = validity;
}
}
