package com.narendra.entity;

public class User {
	private long userId;
	private String name;
	private String address;
	
	public User() {
		super();
	}
	public User(long userId, String name, String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", addresses=" + address + "]";
	}
}
