package com.cos.reflect.controller;

import com.cos.reflect.anno.RequestMapping;
import com.cos.reflect.controller.dto.JoinDto;
import com.cos.reflect.controller.dto.LoginDto;
import com.cos.reflect.model.User;

public class UserController {

	@RequestMapping(value="/user/join")	//하나일때는 생략가능
	public String join(JoinDto dto) {		//username, password, email
		System.out.println("join() 함수 호출됨");
		System.out.println(dto);
		return "/";
	}
	
	@RequestMapping(value="/user/login")
	public String login(LoginDto dto) {		//username, password
		System.out.println("login() 함수 호출됨");
		System.out.println(dto);
		return "/";
	}
	
	@RequestMapping(value="/user/list")
	public String list(User user) {
		System.out.println("list() 함수 호출됨");
		System.out.println(user);
		return "/";
	}
	
	@RequestMapping(value="/hello")
	public String hello() {
		System.out.println("hello() 함수 호출됨");
		return "/";
	}
}
