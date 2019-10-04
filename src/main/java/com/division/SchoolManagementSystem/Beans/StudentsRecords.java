package com.division.SchoolManagementSystem.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class StudentsRecords {
	@Id
	@Column(name="Roll_No")
	private int rollNo;
	@Column(name="Std_Name")
	private String name;
	@Column(name="Std_Age")
	private int age;
	@Column(name="Std_division")
	private String division;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
}
