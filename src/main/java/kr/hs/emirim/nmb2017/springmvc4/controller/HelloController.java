package kr.hs.emirim.nmb2017.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String hello() {
		return "resultPage";
	}
	
//	@ResponseBody
//	public String hello() {
//		return "Hello, World!";
//	}

}
