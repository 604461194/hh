package com.accp.spring4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring4.entity.Goods;
import com.accp.spring4.mapper.GoodsMapper;

@Service
public class GoodsService {

	@Autowired
	public GoodsMapper goodsMapper;
	
	public List<Goods> electAll(){
		return this.goodsMapper.selectAll();
	}

}
