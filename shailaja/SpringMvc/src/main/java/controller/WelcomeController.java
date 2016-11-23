package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class WelcomeController {
	@Autowired
	HelloWorldService service;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Map<String, Object> model){
		model.put("titlte",service.getTitle("Tekgroup home page"));
		model.put("msg", service.getDesc("Spring world"));
		return "index";
		
	}
	
	@RequestMapping(value = "/hello/{name}/{city}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String l_name,@PathVariable("city") String l_city) {

		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		
		model.addObject("title", service.getTitle(l_name));
		model.addObject("msg", service.getTitle(l_name));
		model.addObject("city", service.getTitle(l_city));
		return model;

	}

	

}
