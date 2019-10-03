package com.division.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.division.SchoolManagementSystem.service.*;

@Controller
public class SignUpController {

	@Autowired
	DaoAdminAccess dao;
	
	@RequestMapping("signUp")
	public ModelAndView signUp(String uname, String pass, String repass, String mobNo, String email) {
		System.out.println(uname+" "+pass+" "+repass+" "+mobNo+" "+ email);
		ModelAndView mv = new ModelAndView();
		if(pass.equals(repass)) {
			dao.updateCred(uname,pass,mobNo, email);
			System.out.println("Credentials Updated");
			mv.setViewName("Welcome.jsp");
		}
		return mv;
	}
}
