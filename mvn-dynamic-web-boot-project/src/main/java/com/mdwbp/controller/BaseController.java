package com.mdwbp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mdwbp.dao.UsersDAO;
import com.mdwbp.entity.Users;

@Controller
public class BaseController {
	
	@Autowired
	UsersDAO userDAO;

	@RequestMapping(value = "/homepage")
	public String getHomePage() {
		return "homepage";
	}

	@RequestMapping(value = "/storeData", method = RequestMethod.POST)
	public String storeData(HttpServletRequest request) {
		System.out.println(request.getParameter("fname"));
		userDAO.save(new Users(0,request.getParameter("fname")));
		return "redirect:homepage";
	}
}
