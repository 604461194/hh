package com.accp.springmvc.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.entity.Recorddetail;
import com.accp.springmvc.entity.Timu;
import com.accp.springmvc.mapper.RecorddetailMapper;

@Service
public class RecorddetailSerivce {

	@Autowired
	public RecorddetailMapper recorddetailMapper;
	
	public int insertRecordDetail(Recorddetail recorddetail) {
		return recorddetailMapper.insertRecordDetail(recorddetail);
	}
	
	
	public List<Timu> selectAll(int recordId){
		return this.recorddetailMapper.selectAll(recordId);
	}
}
