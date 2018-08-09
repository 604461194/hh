package com.accp.springmvc.entity;

public class Record {
private int recordId;
private String recordName;
private String submitTime;
private int userId;
private double accuracy;
private int number;
public int getRecordId() {
	return recordId;
}
public void setRecordId(int recordId) {
	this.recordId = recordId;
}
public String getRecordName() {
	return recordName;
}
public void setRecordName(String recordName) {
	this.recordName = recordName;
}
public String getSubmitTime() {
	return submitTime;
}
public void setSubmitTime(String submitTime) {
	this.submitTime = submitTime;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public double getAccuracy() {
	return accuracy;
}
public void setAccuracy(double accuracy) {
	this.accuracy = accuracy;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
}
