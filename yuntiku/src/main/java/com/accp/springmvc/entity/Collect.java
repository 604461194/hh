package com.accp.springmvc.entity;

public class Collect {
private int collectId;
private int userId;
private int subjectId;
private String collectTime;
public int getCollectId() {
	return collectId;
}
public void setCollectId(int collectId) {
	this.collectId = collectId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getSubjectId() {
	return subjectId;
}
public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}
public String getCollectTime() {
	return collectTime;
}
public void setCollectTime(String collectTime) {
	this.collectTime = collectTime;
}
}
