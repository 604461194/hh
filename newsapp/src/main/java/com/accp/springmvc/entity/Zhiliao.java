package com.accp.springmvc.entity;

//'zlId', 'path', 'newsId', 'type'
public class Zhiliao {

	private int zlId;
	private String path;
	private int newsId;
	private int type;
	public int getZlId() {
		return zlId;
	}
	public void setZlId(int zlId) {
		this.zlId = zlId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
