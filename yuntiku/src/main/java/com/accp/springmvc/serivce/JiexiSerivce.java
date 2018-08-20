package com.accp.springmvc.serivce;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.mapper.JiexiMapper;

@Service
public class JiexiSerivce {

	@Autowired
	public JiexiMapper jiexiMapper;
	
	public List<Map<String,Object>> selectAll(){
		return this.jiexiMapper.selectAll();
	}
}
