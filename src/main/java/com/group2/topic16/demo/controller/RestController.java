package com.group2.topic16.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RestController {
	@GetMapping("/demo")
	public String demo(Model model) {
		return "home";
	}
}
