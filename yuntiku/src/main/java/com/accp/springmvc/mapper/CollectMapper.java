package com.accp.springmvc.mapper;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Collect;

public interface CollectMapper {

	Collect selectById(@Param("userId")int userId,
						@Param("subjectId")int subjectId);
	
	
	int insertCollect(Collect collect);
	
	
	int updateCollect(Collect collect);
}
