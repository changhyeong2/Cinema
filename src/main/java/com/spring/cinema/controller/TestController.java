package com.spring.cinema.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String homepage(Locale locale, Model model) {
		return "homepage-1";
	}
}
