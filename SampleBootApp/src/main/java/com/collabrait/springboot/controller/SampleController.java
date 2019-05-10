package com.collabrait.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping(method =RequestMethod.GET, value ="/sample")
	public String getAll() {
		return "Hello API";
	}
	

}
