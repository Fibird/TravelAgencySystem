package cn.edu.ruc.lab505.client.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ruc.lab505.client.model.*;
import cn.edu.ruc.lab505.client.service.*;

@Controller
public class AirlineController {
	@Autowired
	private AirlineService airlineService;
	

	@RequestMapping(value={"/airline-add.html"}, method = RequestMethod.GET)
	  public ModelAndView addAirLine(){
		Airline airline = new Airline();
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("airline", airline);
        modelAndView.setViewName("airline-add");
	    return modelAndView;
	  }
	
	@RequestMapping(value={"/airline-add.html"}, method = RequestMethod.POST)
	  public ModelAndView addAirLineToDB(@Valid Airline airline, BindingResult bindingResult){
		airlineService.saveAirline(airline);
		ModelAndView modelAndView = new ModelAndView();
		List<Airline> airlinelist = airlineService.findAll();
		modelAndView.addObject("airlinelist", airlinelist);
		modelAndView.setViewName("airline-list");
		return modelAndView;
	  }
	
	@RequestMapping(value={"/airline-list.html"}, method = RequestMethod.GET)
	public ModelAndView listAirline() {
		ModelAndView modelAndView = new ModelAndView();
		List<Airline> airlinelist = airlineService.findAll();
		modelAndView.addObject("airlinelist", airlinelist);
		modelAndView.setViewName("airline-list");
		return modelAndView;
	}
	
	public AirlineController() {
		// TODO Auto-generated constructor stub
	}

}
