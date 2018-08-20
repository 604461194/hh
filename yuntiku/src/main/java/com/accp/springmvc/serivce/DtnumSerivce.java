package com.accp.springmvc.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Dtnum;
import com.accp.springmvc.mapper.DtnumMapper;

@Service
public class DtnumSerivce {

	@Autowired
	public DtnumMapper dtnumMapper;
	public int insertDtnum(Dtnum dtnum) {
		return this.dtnumMapper.insertDtnum(dtnum);
	}
}
