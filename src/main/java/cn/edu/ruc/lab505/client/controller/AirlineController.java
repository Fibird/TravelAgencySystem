package cn.edu.ruc.lab505.client.controller;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ruc.lab505.client.model.Airline;
import cn.edu.ruc.lab505.client.model.T_user;
import cn.edu.ruc.lab505.client.service.AirlineService;

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
//		System.out.println("Test: " + airline.getId() + airline.getDeparture() + airline.);
		long time = System.currentTimeMillis();
//		airline.setArrivalTime(new Date(time));
//		airline.setDepartureTime(new Date(time));
		airlineService.saveAirline(airline);
	    ModelAndView mav = new ModelAndView();  
	    mav.setViewName("airline-list");
	    return mav;
	  }
	
	@RequestMapping(value={"/airline-list.html"}, method = RequestMethod.GET)
	public ModelAndView listAirline(/*@Valid Airline airline, BindingResult bindingResult*/) {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("airline-list");
		return modelAndView;
	}
	public AirlineController() {
		// TODO Auto-generated constructor stub
	}

}
