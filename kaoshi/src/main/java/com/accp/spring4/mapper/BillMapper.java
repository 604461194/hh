package com.accp.spring4.mapper;

import com.accp.spring4.entity.Bill;

public interface BillMapper {

	 Bill last();

	 int insert(Bill bill);
	
}
