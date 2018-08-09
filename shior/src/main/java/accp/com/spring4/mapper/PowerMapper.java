package accp.com.spring4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import accp.com.spring4.pojo.Power;

public interface PowerMapper {

	List<Power> findPower(@Param("roleId")int roleId);
	
}
