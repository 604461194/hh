package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Semester;

public interface SemesterMapper {

	Semester selectById(@Param("id")int id);
	
	List<Semester> selectAll();
}
