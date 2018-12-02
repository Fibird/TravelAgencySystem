package cn.edu.ruc.lab505.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ruc.lab505.client.model.CarRental;
import cn.edu.ruc.lab505.client.service.CarRentalService;

@Controller
public class CarrentalController {
	@Autowired
	CarRentalService carRentalService;
	
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
		List<CarRental> carlist = carRentalService.findAll();
		modelAndView.addObject("carlist",carlist);
		modelAndView.setViewName("carrental-list");
		return modelAndView;
	}
	public CarrentalController() {
		// TODO Auto-generated constructor stub
	}

}
