package com.soft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_data")
public class ByUsingScanner {

	@Id
	private int id;
	@Column(name="EName")
	private String Name;
	@Column(name="EEmail")
	private String Email;
	@Column(name="EPassword")
	private String Password;
	public ByUsingScanner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ByUsingScanner(int id, String name, String email, String password) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "ByUsingScanner [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + "]";
	}
	
}
