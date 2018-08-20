package com.accp.springmvc.serivce;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Timu;
import com.accp.springmvc.mapper.TimuMapper;

@Service
public class TimuSerivce {

	@Autowired
	public TimuMapper timuMapper;
	
	
	public List<Timu> selectChapter(int chapterId,int userId){
		return this.timuMapper.selectChapter(chapterId,userId);
	}
	
	
	public List<Timu> selectKnowledgepoint(int knowledgePointId,int userId){
		return this.timuMapper.selectKnowledgepoint(knowledgePointId,userId);
	}
	
	
	public List<Map<String, Object>> selectAllD(){
		return this.timuMapper.selectAllD();
	}
	
	
	public int insertA(Timu timu) {
		
		return this.timuMapper.insertTimu(timu);
	}
}
