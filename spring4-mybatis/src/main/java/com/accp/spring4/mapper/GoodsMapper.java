package com.accp.spring4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.spring4.entity.Goods;

public interface GoodsMapper {
		
		@Select("select * from goods")
		List<Goods> selectAll();
}
