package com.accp.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.IUserBiz;
import com.accp.pojo.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/spring-ctx.xml" })
public class BizTest {
	
	@Autowired
	private IUserBiz userBiz;

	public IUserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(IUserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	@Test
	public void testUser()throws Exception{
	 User user=userBiz.findUser("admin","123");
	 System.out.println(user);
	}
	
}
