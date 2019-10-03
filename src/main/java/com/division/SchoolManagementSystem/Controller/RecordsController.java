package com.division.SchoolManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecordsController {
	
	@RequestMapping("getRecords")
	public ModelAndView fehctRecords() {
		ModelAndView mv = new ModelAndView();
		return mv;
	}
}
