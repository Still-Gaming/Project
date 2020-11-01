package com.kh.jsp.cart.model.vo;

public class Cart {
	private String userId;
	private int gno;
	
	public Cart() {
		super();
	}

	public Cart(String userId, int gno) {
		super();
		this.userId = userId;
		this.gno = gno;
	}

	@Override
	public String toString() {
		return "Cart [userId=" + userId + ", gno=" + gno + "]";
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
