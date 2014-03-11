package com.marika.H2GlassfishTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marika.H2GlassfishTest.service.TestService;
import com.marika.H2GlassfishTest.validation.TestValidator;

@Controller
@RequestMapping(value="/test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private TestValidator testValidator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(testValidator);
	}
}
