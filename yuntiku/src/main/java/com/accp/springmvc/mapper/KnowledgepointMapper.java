package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Knowledgepoint;

public interface KnowledgepointMapper {

	List<Knowledgepoint> selectById(@Param("chapterId")int chapterId);
	
	Knowledgepoint selectKnowledgepoint(@Param("knowledgePointId")int knowledgePointId);
	
}
