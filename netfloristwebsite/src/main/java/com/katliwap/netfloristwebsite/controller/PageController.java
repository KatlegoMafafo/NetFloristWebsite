package com.katliwap.netfloristwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView inex() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Netflorist Website");
		return mv;
	}
}
