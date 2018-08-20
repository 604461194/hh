package com.accp.springmvc.entity;

public class Curriculum {
private int curriculumId;
private String curriculumName;
private int semesterId;
public int getCurriculumId() {
	return curriculumId;
}
public void setCurriculumId(int curriculumId) {
	this.curriculumId = curriculumId;
}
public String getCurriculumName() {
	return curriculumName;
}
public void setCurriculumName(String curriculumName) {
	this.curriculumName = curriculumName;
}
public int getSemesterId() {
	return semesterId;
}
public void setSemesterId(int semesterId) {
	this.semesterId = semesterId;
}
}
