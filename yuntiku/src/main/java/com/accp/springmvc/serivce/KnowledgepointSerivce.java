package com.accp.springmvc.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Knowledgepoint;
import com.accp.springmvc.mapper.KnowledgepointMapper;

@Service
public class KnowledgepointSerivce {

	@Autowired
	public KnowledgepointMapper knowledgepointMapper;
	
	public List<Knowledgepoint> selectKnowledgepoint(int chapterId ){
		return this.knowledgepointMapper.selectById(chapterId);
	}
	
	
	public Knowledgepoint selectOne(int knowledgePointId) {
		return this.knowledgepointMapper.selectKnowledgepoint(knowledgePointId);
	}
}
