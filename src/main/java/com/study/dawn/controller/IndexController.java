package com.study.dawn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public ModelAndView index()
	{
		System.out.println("-------------------------------");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/index1");
		return modelAndView;
	}
}
