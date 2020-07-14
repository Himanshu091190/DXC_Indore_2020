package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	@RequestMapping("/")
	public String redirectTo() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String redirect() {
		return "viewpage";
	}

	@RequestMapping("/helloagain")
	public String display() {
		return "final";
	}
}