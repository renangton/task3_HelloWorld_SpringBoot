package com.HelloWorld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// HTTPリクエストを受け付ける
@Controller
public class HelloController{

	//　[http://localhost:8080/hello-template]へGETメソットでのHTTPリクエストを受け付ける	
	@GetMapping("/hello-template")
	public String hello(Model model) {
		// message:「I am Renato」をビューに渡す
		model.addAttribute("message", "I am Renato");
		
		// 現在時刻を所得し、フォーマットに変換
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String timeDisp = today.format(timeFormat);
		
		// now:timeDisp(現在時刻）をビューに渡す
		model.addAttribute("now", timeDisp);
		
		//　HelloWorld_SpringBoot.htmlに画面遷移		
		return "HelloWorld_SpringBoot";
	}
}
