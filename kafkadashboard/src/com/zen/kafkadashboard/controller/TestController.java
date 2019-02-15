package com.zen.kafkadashboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mnimbalk
 */
@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

}
