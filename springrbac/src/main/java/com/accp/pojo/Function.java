package com.accp.pojo;

import java.util.Date;

public class Function {

	private Integer fid;
	private String fcode;
	private String fname;
	private String furl;
	private Integer fpid;//父ID
	private Date createdate;
	private Function parentFun;//父对象

	public Function getParentFun() {
		return parentFun;
	}

	public void setParentFun(Function parentFun) {
		this.parentFun = parentFun;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFurl() {
		return furl;
	}

	public void setFurl(String furl) {
		this.furl = furl;
	}

	public Integer getFpid() {
		return fpid;
	}

	public void setFpid(Integer fpid) {
		this.fpid = fpid;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	
	@Override
	public String toString() {
		return "Function [fid=" + fid + ", fcode=" + fcode + ", fname=" + fname
				+ ", furl=" + furl + ", fpid=" + fpid + ", createdate="
				+ createdate + ", parentFun=" + parentFun + "]";
	}

	
	

}
