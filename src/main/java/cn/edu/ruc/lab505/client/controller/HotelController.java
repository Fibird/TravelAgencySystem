package cn.edu.ruc.lab505.client.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ruc.lab505.client.model.Hotel;
import cn.edu.ruc.lab505.client.service.HotelService;

@Controller
public class HotelController {
	
	@Autowired
	HotelService hotelSercie;

	@RequestMapping(value={"/hotel-add.html"}, method = RequestMethod.GET)
	public ModelAndView showHotelAdd() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("hotel",new Hotel());
		modelAndView.setViewName("hotel-add");
		return modelAndView;
	}
	
	@RequestMapping(value={"/hotel-add.html"}, method = RequestMethod.POST)
	public ModelAndView addHotel(@Valid Hotel hotel, BindingResult bind) {
		ModelAndView modelAndView = new ModelAndView();
		hotelSercie.saveHotel(hotel);
		modelAndView.setViewName("hotel-add");
		return modelAndView;
	}
	
	@RequestMapping(value={"/hotel-list.html"}, method = RequestMethod.GET)
	public ModelAndView listHotel() {
		ModelAndView modelAndView = new ModelAndView();
		List<Hotel> hotellist = hotelSercie.findAll();
		modelAndView.addObject("hotellist",hotellist);
		modelAndView.setViewName("hotel-list");
		return modelAndView;
	}
	public HotelController() {
		// TODO Auto-generated constructor stub
	}

}
