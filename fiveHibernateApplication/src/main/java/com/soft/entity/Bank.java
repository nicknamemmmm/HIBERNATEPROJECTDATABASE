package com.soft.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="bank_statment")
public class Bank {

	@Id
	private int id;
	private String Name;
	private String Surname;
	private String Email;
	private String Password;
	private double AccoNo;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int id, String name, String surname, String email, String password, double accoNo) {
		super();
		this.id = id;
		this.Name = name;
		this.Surname = surname;
		this.Email = email;
		this.Password = password;
		this.AccoNo = accoNo;
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
		this.Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
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
	public double getAccoNo() {
		return AccoNo;
	}
	public void setAccoNo(double accoNo) {
		AccoNo = accoNo;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", Name=" + Name + ", Surname=" + Surname + ", Email=" + Email + ", Password="
				+ Password + ", AccoNo=" + AccoNo + "]";
	}
	
	
}
