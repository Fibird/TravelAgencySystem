package cn.edu.ruc.lab505.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ruc.lab505.client.model.Guide;
import cn.edu.ruc.lab505.client.service.GuideService;

@Controller
public class GuideController {
	@Autowired
	GuideService guideService;
	
	@RequestMapping(value={"/guide-add.html"}, method = RequestMethod.GET)
	public ModelAndView addHotel() {
		ModelAndView modelAndView = new ModelAndView();
//		airlineService.saveAirline(airline);
//		modelAndView.addObject("successMessage", attributeValue);
		modelAndView.setViewName("guide-add");
		return modelAndView;
	}
	
	@RequestMapping(value={"/guide-list.html"}, method = RequestMethod.GET)
	public ModelAndView listHotel() {
		ModelAndView modelAndView = new ModelAndView();
		List<Guide> guidelist = guideService.findAll();
		modelAndView.addObject("guidelist",guidelist);
		modelAndView.setViewName("guide-list");
		return modelAndView;
	}
}
