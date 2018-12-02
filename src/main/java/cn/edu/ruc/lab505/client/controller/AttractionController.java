package cn.edu.ruc.lab505.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AttractionController {

	@RequestMapping(value={"/attraction-add.html"}, method = RequestMethod.GET)
	public ModelAndView addAttraction() {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("attraction-add");
		return modelAndView;
	}
	
	@RequestMapping(value={"/attraction-list.html"}, method = RequestMethod.GET)
	public ModelAndView listAttraction() {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("attraction-list");
		return modelAndView;
	}
	public AttractionController() {
		// TODO Auto-generated constructor stub
	}

}
