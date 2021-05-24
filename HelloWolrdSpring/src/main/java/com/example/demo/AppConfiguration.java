package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
	@RequestMapping("/hellowolrd")
	public String hellowolrd() {
		return "Hello world 12383";
	}
}
