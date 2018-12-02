package cn.edu.ruc.lab505.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarrentalController {
	@RequestMapping(value={"/carrental-add.html"}, method = RequestMethod.GET)
	public ModelAndView addCarrental() {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("carrental-add");
		return modelAndView;
	}
	
	@RequestMapping(value={"/carrental-list.html"}, method = RequestMethod.GET)
	public ModelAndView listCarrental() {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("carrental-list");
		return modelAndView;
	}
	public CarrentalController() {
		// TODO Auto-generated constructor stub
	}

}
