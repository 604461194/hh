package com.accp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Role {
	
	private Integer rid;
	private String rcode;
	private String rname;
	private Integer rstatus;
	private Date createdate;
	private String createby;
	private List<Function> functions = new ArrayList<Function>();

	public Role(Integer rid, String rcode, String rname, Integer rstatus,
			Date createdate, String createby) {
		super();
		this.rid = rid;
		this.rcode = rcode;
		this.rname = rname;
		this.rstatus = rstatus;
		this.createdate = createdate;
		this.createby = createby;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRcode() {
		return rcode;
	}

	public void setRcode(String rcode) {
		this.rcode = rcode;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Integer getRstatus() {
		return rstatus;
	}

	public void setRstatus(Integer rstatus) {
		this.rstatus = rstatus;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public List<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

	public Role() {
		super();
	}

	public Role(String rcode, String rname, Integer rstatus, Date createdate,
			String createby) {
		super();
		this.rcode = rcode;
		this.rname = rname;
		this.rstatus = rstatus;
		this.createdate = createdate;
		this.createby = createby;
	}

	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rcode=" + rcode + ", rname=" + rname
				+ ", rstatus=" + rstatus + ", createdate=" + createdate
				+ ", createby=" + createby + ", functions=" + functions + "]";
	}
	
	
}
