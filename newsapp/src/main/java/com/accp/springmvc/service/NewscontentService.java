package com.accp.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Newscontent;
import com.accp.springmvc.entity.Pinglun;
import com.accp.springmvc.entity.Zan;
import com.accp.springmvc.mapper.NewscontentMapper;

@Service
public class NewscontentService {
 
	@Autowired
	public  NewscontentMapper newscontentMapper;
	
	public List<Newscontent> selectById(int typeId){
		return this.newscontentMapper.selectNewsById(typeId);
	}
	
	public List<Newscontent> selectNewsById(int newsId){
		return this.newscontentMapper.selectNews(newsId);
	}
	
	public int selectZan(int newsId) {
		return this.newscontentMapper.selectZan(newsId);
	}
	
	public List<Zan> gfZan(int newsId,int userId){
		
		return this.newscontentMapper.gfZan(newsId, userId);
	}
	
	public int zan(Zan zan) {
		return this.newscontentMapper.zan(zan);
	}
	
	public int pinglun(Pinglun pinglin) {
		return this.newscontentMapper.addPinglun(pinglin);
	}
	
	public List<Pinglun> findPingL(int newsId){
		return this.newscontentMapper.findPingL(newsId);
	}
}
