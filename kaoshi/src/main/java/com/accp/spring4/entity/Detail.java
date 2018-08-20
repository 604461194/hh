package com.accp.spring4.entity;

//'billno',
//'lineId',
//'goodsName',
//'goodsNum',
//'goodsPrice',
//'goodsMoneyAmt',
//'isPresent'
public class Detail {
private String billno;
private int lineId;
private String goodsName;
private double goodsNum;
private double goodsPrice;
private double goodsMoneyAmt;
private int isPresent;
public String getBillno() {
	return billno;
}
public void setBillno(String billno) {
	this.billno = billno;
}
public int getLineId() {
	return lineId;
}
public void setLineId(int lineId) {
	this.lineId = lineId;
}
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public double getGoodsNum() {
	return goodsNum;
}
public void setGoodsNum(double goodsNum) {
	this.goodsNum = goodsNum;
}
public double getGoodsPrice() {
	return goodsPrice;
}
public void setGoodsPrice(double goodsPrice) {
	this.goodsPrice = goodsPrice;
}
public double getGoodsMoneyAmt() {
	return goodsMoneyAmt;
}
public void setGoodsMoneyAmt(double goodsMoneyAmt) {
	this.goodsMoneyAmt = goodsMoneyAmt;
}
public int getIsPresent() {
	return isPresent;
}
public void setIsPresent(int isPresent) {
	this.isPresent = isPresent;
}

}
