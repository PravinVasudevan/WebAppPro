package com.division.SchoolManagementSystem.Beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Credentials {
	@Id
	private String uname;
	private String pass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Credentials() {
		System.out.println("Credentials Bean is created");
	}
	@Override
	public String toString() {
		return "Credentials [uname=" + uname + ", pass=" + pass + "]";
	}
}
