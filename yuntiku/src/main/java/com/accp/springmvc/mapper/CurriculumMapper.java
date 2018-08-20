package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Curriculum;

public interface CurriculumMapper {
	
	List<Curriculum> selectById(@Param("userId")int userId);
}
