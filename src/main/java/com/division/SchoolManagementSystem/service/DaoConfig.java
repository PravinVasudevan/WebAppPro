package com.division.SchoolManagementSystem.service;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.division.SchoolManagementSystem.Beans.Credentials;
import com.division.SchoolManagementSystem.Beans.StudentsRecords;

@Service
public class DaoConfig {
	private Configuration con;
	private SessionFactory sf;
	private Session session;
	private Transaction trans;
	public DaoConfig() {
		con = new Configuration().configure().addAnnotatedClass(Credentials.class).addAnnotatedClass(StudentsRecords.class);
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
