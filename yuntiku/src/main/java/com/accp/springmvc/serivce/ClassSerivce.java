package com.accp.springmvc.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Classes;
import com.accp.springmvc.mapper.ClassMapper;

@Service
public class ClassSerivce {
	@Autowired
	public ClassMapper classMapper; 
	
	public List<Classes> selectAll(){
		return this.classMapper.selectAll();
	}
}
