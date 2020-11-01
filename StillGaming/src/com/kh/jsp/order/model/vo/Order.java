package com.kh.jsp.order.model.vo;

public class Order {
	private int orderNo;
	private String userId;
	private int gno;
	
	public Order() {
		super();
	}

	public Order(int orderNo, String userId, int gno) {
		super();
		this.orderNo = orderNo;
		this.userId = userId;
		this.gno = gno;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", userId=" + userId + ", gno=" + gno + "]";
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}
}
