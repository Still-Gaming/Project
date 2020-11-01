package com.kh.jsp.pay.model.vo;

public class Pay {
	private int payNo;
	private int orderNo;
	private String option;
	private String cardCompany;
	private String status;
	
	public Pay() {
		super();
	}
	
	public Pay(int payNo, int orderNo, String option, String cardCompany, String status) {
		super();
		this.payNo = payNo;
		this.orderNo = orderNo;
		this.option = option;
		this.cardCompany = cardCompany;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Pay [payNo=" + payNo + ", orderNo=" + orderNo + ", option=" + option + ", cardCompany=" + cardCompany
				+ ", status=" + status + "]";
	}

	public int getPayNo() {
		return payNo;
	}

	public void setPayNo(int payNo) {
		this.payNo = payNo;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getCardCompany() {
		return cardCompany;
	}

	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
