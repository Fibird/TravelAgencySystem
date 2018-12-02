package cn.edu.ruc.lab505.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ruc.lab505.client.model.Attraction;
import cn.edu.ruc.lab505.client.service.AttractionService;

@Controller
public class AttractionController {
	@Autowired
	AttractionService attractionService;

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
		List<Attraction> attractionlist = attractionService.findall();
		modelAndView.addObject("attractionlist",attractionlist);
		modelAndView.setViewName("attraction-list");
		return modelAndView;
	}
	public AttractionController() {
		// TODO Auto-generated constructor stub
	}

}
