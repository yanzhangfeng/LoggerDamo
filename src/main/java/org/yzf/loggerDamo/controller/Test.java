package org.yzf.loggerDamo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yzf.loggerDamo.service.ServiceTest;

@Controller
public class Test {

	@Autowired
	private ServiceTest serviceTest;
	
	@RequestMapping(path = "index")
	public ModelAndView index(){
			try {
				serviceTest.test();
				return new ModelAndView("index");
			} catch (Exception e) {
				return new ModelAndView("error");
			}
	}
}
