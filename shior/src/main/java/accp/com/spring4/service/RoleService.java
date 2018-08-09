package accp.com.spring4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import accp.com.spring4.mapper.RoleMapper;
import accp.com.spring4.pojo.Role;

@Service
public class RoleService {

	@Autowired
	public RoleMapper roleMapper;
	
	public List<Role> findRole(int userId){
		return this.roleMapper.findRole(userId);
	}
}
