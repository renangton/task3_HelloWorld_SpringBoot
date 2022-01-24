package com.HelloWorld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController{

	@GetMapping("/hello-template")
	public String hello(Model model) {
		model.addAttribute("message", "I am Renato");
		
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String timeDisp = today.format(timeFormat);
		model.addAttribute("now", timeDisp);
		return "HelloWorld_SpringBoot";
	}
}
