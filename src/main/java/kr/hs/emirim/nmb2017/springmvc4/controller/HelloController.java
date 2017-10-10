package kr.hs.emirim.nmb2017.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String hello(@RequestParam("name")String userName,Model model) {
		model.addAttribute("message", userName+"�� �ȳ��ϼ���!");
		return "resultPage";
	}
}
	


