package com.accp.springmvc.entity;

// `chapterId`,`chapterName`,`curriculumId`
public class Chapter {
 private int chapterId;
 private String chapterName;
 private int curriculumId;
public int getChapterId() {
	return chapterId;
}
public void setChapterId(int chapterId) {
	this.chapterId = chapterId;
}
public String getChapterName() {
	return chapterName;
}
public void setChapterName(String chapterName) {
	this.chapterName = chapterName;
}
public int getCurriculumId() {
	return curriculumId;
}
public void setCurriculumId(int curriculumId) {
	this.curriculumId = curriculumId;
}
}
