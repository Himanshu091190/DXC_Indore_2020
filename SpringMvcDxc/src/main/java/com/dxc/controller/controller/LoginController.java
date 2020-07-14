package com.dxc.controller.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {


	@RequestMapping(value="/login")
	public ModelAndView redirectLogin(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
	

	@RequestMapping(value="/signup")
	public ModelAndView redirectSignup(HttpServletResponse response) throws IOException{
		return new ModelAndView("signup");
	}
}
