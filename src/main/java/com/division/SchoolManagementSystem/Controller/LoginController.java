package com.division.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.division.SchoolManagementSystem.service.DaoService;

@Controller
public class LoginController {
	@Autowired
	DaoService dao;
	
	@RequestMapping("login")
	public ModelAndView login(String uname, String pass) {
		ModelAndView mv = new ModelAndView();
		if(dao.validateCred(uname, pass)) {
			mv.setViewName("Welcome.jsp");
			mv.addObject("uname", uname);
		}else {
			mv.setViewName("Login.jsp");
			mv.addObject("uname", uname);
		}
		return mv;
	}
}
