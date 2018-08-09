package com.accp.springmvc.entity;

public class Users {
private int userId;
private String account;
private String passWord;
private String userName;
private String registerTime;
private int classesId;
private String lastTime;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getRegisterTime() {
	return registerTime;
}
public void setRegisterTime(String registerTime) {
	this.registerTime = registerTime;
}
public int getClassesId() {
	return classesId;
}
public void setClassesId(int classesId) {
	this.classesId = classesId;
}
public String getLastTime() {
	return lastTime;
}
public void setLastTime(String lastTime) {
	this.lastTime = lastTime;
}
@Override
public String toString() {
	return "Users [userId=" + userId + ", account=" + account + ", passWord=" + passWord + ", userName=" + userName
			+ ", registerTime=" + registerTime + ", classesId=" + classesId + ", lastTime=" + lastTime + "]";
}
}
