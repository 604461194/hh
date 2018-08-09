package com.accp.springmvc.entity;
//
//'newsId', 
//'content', 
//'userId'
public class Newscontent {

	private int newsId;
	private String content;
	private int userId;
	private int typeId;
	private Zhiliao zhiliao;
	private String title;
	private Users users;
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Zhiliao getZhiliao() {
		return zhiliao;
	}
	public void setZhiliao(Zhiliao zhiliao) {
		this.zhiliao = zhiliao;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
