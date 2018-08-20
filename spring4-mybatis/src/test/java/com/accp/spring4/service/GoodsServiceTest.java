package com.accp.spring4.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.accp.spring4.Appuration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {Appuration.class})
public class GoodsServiceTest {

	@Autowired
	private GoodsService goodsService;
	
	@Test
	public void testElectAll() {
		assertNotNull(this.goodsService.electAll());
	}

}
