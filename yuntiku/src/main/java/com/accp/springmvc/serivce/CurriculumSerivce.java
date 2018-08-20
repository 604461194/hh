package com.accp.springmvc.serivce;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Curriculum;
import com.accp.springmvc.mapper.CurriculumMapper;

@Service
public class CurriculumSerivce {

	@Autowired
	public CurriculumMapper curriculumMapper;
	
	public List<Curriculum> selectCurriculum(int userId){
		return this.curriculumMapper.selectById(userId);
	}
	
}
