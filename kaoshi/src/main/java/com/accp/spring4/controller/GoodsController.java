package com.accp.spring4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring4.entity.Bill;
import com.accp.spring4.entity.Detail;
import com.accp.spring4.service.BillService;
import com.accp.spring4.service.DetailService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	public BillService billService;

	@Autowired
	public DetailService detailService;

	@RequestMapping("/test")
	public String test() {
		return "goods";
	}

	@ResponseBody
	@RequestMapping("/jointest")
	public int join(Bill bill) {
		 List<Detail> goodsDetailJson = JSONObject.parseArray(bill.getDetail(),Detail.class);
		this.billService.insert(bill);
		for(int i=0;i<goodsDetailJson.size();i++) {
			goodsDetailJson.get(i).setBillno(bill.getBillno());
			if(goodsDetailJson.size()>1) {
				goodsDetailJson.get(i).setLineId(goodsDetailJson.get(i).getLineId()+i);
			}
			this.detailService.insertDetail(goodsDetailJson.get(i));
		}
		 return 1;
	}
	
	@ResponseBody
	@RequestMapping("/joinfuwu")
	public Bill joinfuwu(Bill bill) {
		bill = this.billService.last();
		List<Detail> details = this.detailService.select(bill.getBillno());
		bill.setDetails(details);
		return bill;
	}
}
