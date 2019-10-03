package com.division.SchoolManagementSystem.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.division.SchoolManagementSystem.Beans.Credentials;

@Service
public class DaoConfig {
	private Configuration con;
	private SessionFactory sf;
	private Session session;
	private Transaction trans;
	public DaoConfig() {
		con = new Configuration().configure().addAnnotatedClass(Credentials.class);
		sf = con.buildSessionFactory();
		session  = sf.openSession();
		trans = session.beginTransaction();
	}
	public Session getSession() {
		return session;
	}
	public Transaction getTrans() {
		return trans;
	}	
}
