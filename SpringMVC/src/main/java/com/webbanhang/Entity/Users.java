package com.webbanhang.Entity;

public class Users {
	
	private String name;
	private String user;
	private String password;
	private String email;
	private int admin;
	public Users(String name, String user, String password, String email, int admin) {
		super();
		this.name = name;
		this.user = user;
		this.password = password;
		this.email = email;
		this.admin = admin;
	}
	public Users() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
}
