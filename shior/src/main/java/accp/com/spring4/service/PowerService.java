package accp.com.spring4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import accp.com.spring4.mapper.PowerMapper;
import accp.com.spring4.pojo.Power;

@Service
public class PowerService {

	@Autowired
	public PowerMapper powerMapper;
	
	public List<Power> findPower(int roleId){
		return this.powerMapper.findPower(roleId);
	}
}
