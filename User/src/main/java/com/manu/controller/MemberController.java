package com.manu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@RequestMapping(value="join" , method = RequestMethod.GET)
	public void joinGET() {
		logger.info("회원가입페이지");
	}
	
	@RequestMapping(value = "login" , method=RequestMethod.GET)
	public void loginGET() {
		logger.info("로그인 페이지 진입");
	}
}
