package accp.com.spring4.mapper;

import java.util.List;

import accp.com.spring4.pojo.Role;

public interface RoleMapper {

	List<Role> findRole(int userId);
}
