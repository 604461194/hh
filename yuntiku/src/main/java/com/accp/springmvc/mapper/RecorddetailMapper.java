package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Recorddetail;
import com.accp.springmvc.entity.Timu;

public interface RecorddetailMapper {

	int insertRecordDetail(Recorddetail recorddetail);
	
	
	List<Timu> selectAll(@Param("recordId")int recordId);
}
