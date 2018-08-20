package com.accp.springmvc.serivce;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Record;
import com.accp.springmvc.mapper.RecordMapper;

@Service
public class RecordSerivce {

	@Autowired
	public RecordMapper recordMapper;
	
	
	public List<Record> selectMyHistory(int usersId){
		return this.recordMapper.selectMyHistory(usersId);
	}
	
	
	public int insertRecord(Record record) {
		return this.recordMapper.insertRecord(record);
	}
	
	
	public int updateRecord(double accuracy,int recordId) {
		return this.recordMapper.updateRecord(accuracy, recordId);
	}
	
	public List<Map<String,Object>> selectPai(){
		return this.recordMapper.selectPai();
	}
}
