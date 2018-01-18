package com.ITSchedule.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {

	@RequestMapping("/")
	public String mainPage() {
		return "Hello Word Testing Page!";
	}
}
