package com.division.SchoolManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.division.SchoolManagementSystem.Beans.Credentials;

@Service
public class DaoAdminAccess {
	@Autowired
	DaoConfig config;
	@Autowired
	Credentials cred;
	public boolean validateCred(String uname, String password) {
		cred = (Credentials) config.getSession().load(Credentials.class, uname);
		if(cred!=null && (cred.getPass()).equals(password)) {
			config.getTrans().commit();
			return true;
		}
		return false;
	}
	public void updateCred(String uname, String password, String mobNo, String email) {
		cred.setUname(uname);
		cred.setPass(password);
		cred.setEmail(email);
		cred.setMobileNum(mobNo);
		config.getSession().save(cred);
		config.getTrans().commit();
	}
}
