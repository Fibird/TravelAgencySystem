package cn.edu.ruc.lab505.client.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ruc.lab505.client.model.Airline;

@Controller
public class WelcomeController {

	public WelcomeController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value={"/welcome.html"}, method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("welcome");
		return modelAndView;
	}
}
