package com.accp.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring4.entity.Bill;
import com.accp.spring4.mapper.BillMapper;

@Service
public class BillService {

	@Autowired
	public BillMapper billMapper;
	
	public Bill last() {
		return this.billMapper.last();
	}
	
	public int insert(Bill bill) {
		return this.billMapper.insert(bill);
	}
}
