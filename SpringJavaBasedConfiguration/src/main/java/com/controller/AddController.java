package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
{
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("1stnum") int num1,@RequestParam("2ndnum") int num2)
	{
		ModelAndView mv = new ModelAndView();
		int result = num1+num2;
		
		mv.addObject("result",result);
		mv.setViewName("display");
		return mv;
		
	}
}
