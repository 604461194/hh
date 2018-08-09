package com.accp.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Newstyep;
import com.accp.springmvc.mapper.NewstyepMapper;

@Service
public class NewstyepService {

	@Autowired
	public NewstyepMapper newstyepMapper;
	
	public List<Newstyep> selectTypeAll(){
		return this.newstyepMapper.selectAll();
	}
}
