package com.accp.springmvc.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Record;

public interface RecordMapper {

	List<Record> selectMyHistory(@Param("usersId")int usersId);
	
	int insertRecord(Record record);
	
	
	int updateRecord(@Param("accuracy")double accuracy,
					 @Param("recordId")int recordId);
	
	List<Map<String,Object>> selectPai();
}
