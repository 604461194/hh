package com.accp.spring4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring4.entity.Detail;
import com.accp.spring4.mapper.DetailMapper;

@Service
public class DetailService {

	@Autowired
	public DetailMapper detailMapper;
	
	public List<Detail> select(String billno){
		return this.detailMapper.selectById(billno);
	}
	
	public int insertDetail(Detail detail) {
		return this.detailMapper.insertDetail(detail);
	}
}
