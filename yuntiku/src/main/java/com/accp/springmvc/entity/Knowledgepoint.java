package com.accp.springmvc.entity;

public class Knowledgepoint {
private int knowledgePointId;
private String knowledgePointName;
private int chapterId;
public int getKnowledgePointId() {
	return knowledgePointId;
}
public void setKnowledgePointId(int knowledgePointId) {
	this.knowledgePointId = knowledgePointId;
}
public String getKnowledgePointName() {
	return knowledgePointName;
}
public void setKnowledgePointName(String knowledgePointName) {
	this.knowledgePointName = knowledgePointName;
}
public int getChapterId() {
	return chapterId;
}
public void setChapterId(int chapterId) {
	this.chapterId = chapterId;
}

}
