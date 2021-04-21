package com.bit.hellospring.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping({"", "/main"})	// 멀티 매핑
	public String main(HttpServletResponse response) {
		return "MainController:main()";
	}
}
