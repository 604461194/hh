package com.accp.springmvc.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Chapter;
import com.accp.springmvc.mapper.ChapterMapper;

@Service
public class ChapterSerivce {

	@Autowired
	public ChapterMapper chapterMapper;
	
	public List<Chapter> selectChapter(int curriculumId){
		return this.chapterMapper.selectById(curriculumId);
	}
	
	
	public Chapter selectChapterId(int chapterId) {
		return this.chapterMapper.selectChapterId(chapterId);
	}
}
