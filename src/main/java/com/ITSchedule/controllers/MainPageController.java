package com.ITSchedule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class MainPageController {

//	@RequestMapping("/")
//	public String mainPage() {
//		return "Hello Word Testing Page!";
//	}

	@GetMapping(value="/")
	public String homepage(){
		return "index";
	}
}
