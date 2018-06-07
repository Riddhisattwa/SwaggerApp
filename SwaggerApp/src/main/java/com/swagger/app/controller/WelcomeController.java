package com.swagger.app.controller;



import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String index(ModelMap model) {
		model.addAttribute("title","Dear Learners");
		model.addAttribute("message", "Welcome to SpringBoot");
        return "hello";
	}
}
