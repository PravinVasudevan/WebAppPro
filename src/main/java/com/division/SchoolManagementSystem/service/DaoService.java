package com.division.SchoolManagementSystem.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.division.SchoolManagementSystem.Beans.Credentials;

@Service
public class DaoService {
	public DaoService() {
		System.out.println("DAO Service bean is created");
	}
	Configuration con = new Configuration().configure().addAnnotatedClass(Credentials.class);
	SessionFactory sf = con.buildSessionFactory();
	Session session  = sf.openSession();
	Transaction trans = session.beginTransaction();
	@Autowired
	Credentials cred;
	public boolean validateCred(String uname, String password) {
		cred = (Credentials) session.load(Credentials.class, uname);
		if(cred!=null && (cred.getPass()).equals(password)) {
			trans.commit();
			return true;
		}
		return false;
	}
}
