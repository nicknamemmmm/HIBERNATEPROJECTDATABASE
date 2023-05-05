package com.soft.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;


@Entity
@Table(name="family_detail")
public class FamilyDetails {
    @Id
	private String  Name;
	private String Surname;
	private String Work;
	private String Nickname;
	private int salary;
	public FamilyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public FamilyDetails(String name, String surname, String work, String nickname, int salary) {
		super();
		this.Name = name;
		this.Surname = surname;
		this.Work = work;
		this.Nickname = nickname;
		this.salary = salary;
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
	public String getWork() {
		return Work;
	}
	public void setWork(String work) {
		Work = work;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "FamilyDetails [Name=" + Name + ", Surname=" + Surname + ", Work=" + Work + ", Nickname=" + Nickname
				+ ", salary=" + salary + "]";
	}
	
	
}
