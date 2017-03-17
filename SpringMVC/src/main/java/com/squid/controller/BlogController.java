package com.squid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
@RequestMapping("test")
	public String test(){
		
		
		return "index";
		
	}
}
