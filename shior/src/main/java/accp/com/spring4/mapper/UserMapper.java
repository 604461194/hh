package accp.com.spring4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import accp.com.spring4.pojo.User;

public interface UserMapper {

	List<User> findUser(@Param("userName")String userName);

	
}
