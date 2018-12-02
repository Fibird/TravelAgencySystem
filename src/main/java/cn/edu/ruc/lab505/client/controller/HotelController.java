package cn.edu.ruc.lab505.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {

	@RequestMapping(value={"/hotel-add.html"}, method = RequestMethod.GET)
	public ModelAndView addHotel() {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("hotel-add");
		return modelAndView;
	}
	
	@RequestMapping(value={"/hotel-list.html"}, method = RequestMethod.GET)
	public ModelAndView listHotel() {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("hotel-list");
		return modelAndView;
	}
	public HotelController() {
		// TODO Auto-generated constructor stub
	}

}
