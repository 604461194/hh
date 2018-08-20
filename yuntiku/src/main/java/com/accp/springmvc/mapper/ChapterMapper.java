package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Chapter;

public interface ChapterMapper {

	List<Chapter> selectById(@Param("curriculumId")int curriculumId);
	
	Chapter selectChapterId(@Param("chapterId")int chapterId);
}
