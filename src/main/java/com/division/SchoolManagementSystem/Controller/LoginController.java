package com.division.SchoolManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("login")
	public ModelAndView login(String uname, String pass) {
		ModelAndView mv = new ModelAndView();
		if(uname.equals("Praveen")&&pass.equals("guna")) {
			mv.setViewName("Welcome.jsp");
			mv.addObject("uname", uname);
		}else {
			mv.setViewName("Login.jsp");
			mv.addObject("uname", uname);
		}
		return mv;
	}
}
