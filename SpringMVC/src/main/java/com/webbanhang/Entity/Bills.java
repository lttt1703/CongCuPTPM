package com.webbanhang.Entity;

public class Bills {
	
	private int id;
	private String user;
	private String phone;
	private String address;
	private double total;
	private int quanty;
	private String note;
	
	public Bills(int id, String user, String phone, String address, double total, int quanty, String note) {
		super();
		this.id = id;
		this.user = user;
		this.phone = phone;
		this.address = address;
		this.total = total;
		this.quanty = quanty;
		this.note = note;
	}
	public Bills() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
