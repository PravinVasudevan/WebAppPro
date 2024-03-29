package com.division.SchoolManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.division.SchoolManagementSystem.Beans.StudentsRecords;
import com.division.SchoolManagementSystem.service.DaoSTDDataAccess;

@RestController
public class RecordsController {
	@Autowired
	DaoSTDDataAccess std_Fetcher;
	@GetMapping("getRecords")	
	public List<StudentsRecords> fehctRecords() {
		return std_Fetcher.getAllRecords();
	}
	
	@GetMapping("/record/{id}")
	public StudentsRecords fetchRecord(@PathVariable ("id") long id) {
		return std_Fetcher.getRecord((int) id);
	}
}
