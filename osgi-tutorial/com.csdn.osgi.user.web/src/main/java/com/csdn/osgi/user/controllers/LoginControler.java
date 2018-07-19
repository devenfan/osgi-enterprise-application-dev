package com.csdn.osgi.user.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginControler implements Controller {

	private SqlSession sqlMap;
	
	public void setSqlMap(SqlSession sqlMap) {
		this.sqlMap = sqlMap;
	}
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("UserName=>" + userName + ";" + "Password=>" + password);
		
		if(userName == null || password == null){
			return new  ModelAndView("login");
		}
		
		String pword = (String) sqlMap.selectOne("user.getPasswordByName", userName);
		System.out.println(pword);
		
		if(pword !=null && pword.equals(password)){
			return new ModelAndView("success");
		} else {
			return new  ModelAndView("login");
		}
		
	}
	
	

}
