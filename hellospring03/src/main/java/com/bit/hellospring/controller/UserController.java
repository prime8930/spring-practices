package com.bit.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.hellospring.vo.UserVo;

/*
 * 
 * @RequestMapping
 * Method(Handler) + Type(Class) 매핑
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
//	public String join(String name, String email, String password) {
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";	// 매핑한 것만 쓰면 된다.
	}
	
	@ResponseBody
	@RequestMapping(value="/update")
	public String update(@RequestParam("n") String name) {
		/*
		 * 만일 n이라는 이름으로 파라미터가 전달되지 않으면 400 bad request 오류 발생
		 */
		System.out.println(name);
		return "UserController:update()";
	}
	
	@ResponseBody
	@RequestMapping(value="/update2")
	public String update2(
			@RequestParam(value="name", required=true, defaultValue="") String name,
			@RequestParam(value="age", required=true, defaultValue="0") int age) {
		System.out.println("-----" + name + "-----" + age);
		return "UserController:update()";
	}
	
	@ResponseBody
	@RequestMapping(value="/test")
	public String test(@RequestParam(value="name", required=false, defaultValue="null") String name) {
		return name;
		
	}

}
