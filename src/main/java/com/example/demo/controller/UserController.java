package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.People;

@Controller
public class UserController {

	@Autowired
	UserDAO userdao;
	
	@RequestMapping("index")
	public String user()
	{
		return "index.jsp";
	}
	
	@RequestMapping("addUser")
	public String addUser(People user)
	{
		userdao.save(user);
		return "index.jsp";
	}
	
}
