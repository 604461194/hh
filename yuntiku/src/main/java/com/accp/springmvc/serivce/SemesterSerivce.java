package com.accp.springmvc.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Semester;
import com.accp.springmvc.mapper.SemesterMapper;

@Service
public class SemesterSerivce {
	@Autowired
	public SemesterMapper semesterMapper;
	
	public Semester selectById(int id) {
		return this.semesterMapper.selectById(id);
	}
	
	public List<Semester> selectAll(){
		return this.semesterMapper.selectAll();
	}
}
