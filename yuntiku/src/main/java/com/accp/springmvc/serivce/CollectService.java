package com.accp.springmvc.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Collect;
import com.accp.springmvc.mapper.CollectMapper;

@Service
public class CollectService {

	@Autowired
	public CollectMapper collectMapper;
	
	
	public Collect selectById(int userId,int subjectId) {
		return this.collectMapper.selectById(userId, subjectId);
	}
	
	public int insertCollect(Collect collect) {
		return this.collectMapper.insertCollect(collect);
	}
	
	public int updateCollect(Collect collect) {
		return this.collectMapper.updateCollect(collect);
	}
}
