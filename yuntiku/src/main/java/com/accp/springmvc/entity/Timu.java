package com.accp.springmvc.entity;

public class Timu {
private int subjectId;
private String content;
private  int knowledgePointId;
private String optionContentA;
private String optionContentB;
private String optionContentC;
private String optionContentD;
private String optionContentE;
private String validity;
private Recorddetail recorddetail;
private Record record;

public Record getRecord() {
	return record;
}
public void setRecord(Record record) {
	this.record = record;
}
public Recorddetail getRecorddetail() {
	return recorddetail;
}
public void setRecorddetail(Recorddetail recorddetail) {
	this.recorddetail = recorddetail;
}
public int getSubjectId() {
	return subjectId;
}
public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getKnowledgePointId() {
	return knowledgePointId;
}
public void setKnowledgePointId(int knowledgePointId) {
	this.knowledgePointId = knowledgePointId;
}
public String getOptionContentA() {
	return optionContentA;
}
public void setOptionContentA(String optionContentA) {
	this.optionContentA = optionContentA;
}
public String getOptionContentB() {
	return optionContentB;
}
public void setOptionContentB(String optionContentB) {
	this.optionContentB = optionContentB;
}
public String getOptionContentC() {
	return optionContentC;
}
public void setOptionContentC(String optionContentC) {
	this.optionContentC = optionContentC;
}
public String getOptionContentD() {
	return optionContentD;
}
public void setOptionContentD(String optionContentD) {
	this.optionContentD = optionContentD;
}
public String getOptionContentE() {
	return optionContentE;
}
public void setOptionContentE(String optionContentE) {
	this.optionContentE = optionContentE;
}
public String getValidity() {
	return validity;
}
public void setValidity(String validity) {
	this.validity = validity;
}
}
