package com.accp.springmvc.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Timu;

public interface TimuMapper {

	List<Timu> selectChapter(@Param("chapterId")int chapterId,@Param("userId")int userId);

	List<Timu> selectKnowledgepoint(@Param("knowledgePointId")int knowledgePointId,@Param("userId")int userId);
	
	List<Map<String, Object>> selectAllD();
	
	
	int insertTimu(Timu timu);
	
}
