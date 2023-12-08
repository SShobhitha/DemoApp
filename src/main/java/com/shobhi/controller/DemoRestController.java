package com.shobhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/test")
	public String testing() {
		return "Welocme to this Page";
	}

}
