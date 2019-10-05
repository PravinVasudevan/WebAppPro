package com.division.SchoolManagementSystem.service;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.division.SchoolManagementSystem.Beans.StudentsRecords;

@Service
public class DaoSTDDataAccess {
	@Autowired
	static DaoConfig config= new DaoConfig();
	
	@Autowired
	StudentsRecords record; 
	
	List <StudentsRecords> records;
	
	@SuppressWarnings("unchecked")
	public List <StudentsRecords> getAllRecords() {
		String queryString = "from StudentsRecords";
		Query query = config.getSession().createQuery(queryString);
		records = query.list();
		return records;
	}	
	
	public StudentsRecords getRecord(int id) {
		record = config.getSession().get(StudentsRecords.class, id);
		return record;
	}	
	
}
