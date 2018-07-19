package com.csdn.osgi.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		
		System.out.println("Test Controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		return mv;
	}

}
