package com.soft.entity;

public class Student {

	private int id;
	private String name;
	private String scname;
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String scname) {
		super();
		this.id = id;
		this.name = name;
		this.scname = scname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScname() {
		return scname;
	}
	public void setScname(String scname) {
		this.scname = scname;
	}
	
}
