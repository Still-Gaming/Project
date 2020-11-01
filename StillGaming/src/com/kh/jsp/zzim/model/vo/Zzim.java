package com.kh.jsp.zzim.model.vo;

public class Zzim {
	private String userId;
	private int gno;
	
	public Zzim() {
		super();
	}

	public Zzim(String userId, int gno) {
		super();
		this.userId = userId;
		this.gno = gno;
	}

	@Override
	public String toString() {
		return "Zzim [userId=" + userId + ", gno=" + gno + "]";
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
