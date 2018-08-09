package com.accp.spring4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.spring4.entity.Detail;

public interface DetailMapper {

	List<Detail> selectById(@Param("billno")String billno);
	
	int insertDetail(Detail detail);
}