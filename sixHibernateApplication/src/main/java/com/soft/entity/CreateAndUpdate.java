package com.soft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_text")
public class CreateAndUpdate {

	@Id
	private int id;
	@Column(name="std_Name")
	private String Name;
	@Column(name="std_Surname")
	private String Surname;
	@Column(name="std_Nickname")
	private String Nickname;
	@Column(name="std_Email")
	private String Email;
	@Column(name="std_Password")
	private String Password;
	public CreateAndUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateAndUpdate(int id, String name, String surname, String nickname, String email, String password) {
		super();
		this.id = id;
		this.Name = name;
		this.Surname = surname;
		this.Nickname = nickname;
		this.Email = email;
		this.Password = password;
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
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
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
		return "CreateAndUpdate [id=" + id + ", Name=" + Name + ", Surname=" + Surname + ", Nickname=" + Nickname
				+ ", Email=" + Email + ", Password=" + Password + "]";
	}
	
	
}
