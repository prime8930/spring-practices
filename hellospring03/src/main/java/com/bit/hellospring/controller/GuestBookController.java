package com.bit.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 
 * @RequestMapping
 * Type(Class) 단독 매핑
 */


@Controller
@RequestMapping("/guestbook/*")
public class GuestBookController {

	@ResponseBody
	@RequestMapping()
	public String list() {
		return "GuestBookController:list()";
	}
	
	@ResponseBody
	@RequestMapping()
	public String delete() {
		return "GuestBookController:delete()";
	}
	
	
}
