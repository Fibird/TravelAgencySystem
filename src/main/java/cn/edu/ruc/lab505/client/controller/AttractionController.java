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
import cn.edu.ruc.lab505.client.service.AttractionService;

@Controller
public class AttractionController {
	@Autowired
	AttractionService attractionService;

	@RequestMapping(value={"/attraction-add.html"}, method = RequestMethod.GET)
	public ModelAndView addAttraction() {
		ModelAndView modelAndView = new ModelAndView();
		Attraction attraction = new Attraction();
		modelAndView.addObject("attraction", attraction);
		modelAndView.setViewName("attraction-add");
		return modelAndView;
	}
	
	@RequestMapping(value={"/attraction-add.html"}, method = RequestMethod.POST)
	  public ModelAndView addAttractionToDB(@Valid Attraction attraction, BindingResult bindingResult) {
		attractionService.saveAttraction(attraction);
		ModelAndView modelAndView = new ModelAndView();
		List<Attraction> attractionlist = attractionService.findall();
		modelAndView.addObject("attractionlist",attractionlist);
		modelAndView.setViewName("attraction-list");
		return modelAndView;
	  }
	
	@RequestMapping(value={"/attraction-list.html"}, method = RequestMethod.GET)
	public ModelAndView listAttraction() {
		ModelAndView modelAndView = new ModelAndView();
		List<Attraction> attractionlist = attractionService.findall();
		modelAndView.addObject("attractionlist",attractionlist);
		modelAndView.setViewName("attraction-list");
		return modelAndView;
	}
	public AttractionController() {
		// TODO Auto-generated constructor stub
	}

}
