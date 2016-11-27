package com.mkyong.helloworld.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mkyong.helloworld.web.service.HelloWorldService;

@Controller
public class WelcomeController {
	
	
	
	
	
	@Autowired
	HelloWorldService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
		model.put("title", service.getTitle("tekgroup home page"));
		model.put("msg", service.getDesc("Spring World"));
		return "index";
	}
	
	
	@RequestMapping(value = "/hello/{name}/{city}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String l_name, @PathVariable("city") String l_city) {

		ModelAndView model = new ModelAndView();
		model.setViewName("index");

		model.addObject("title", service.getTitle(l_name));
		model.addObject("msg", service.getDesc(l_name));
		model.addObject("city", service.getDesc(l_city));

		return model;

	}

}
