package cn.edu.ruc.lab505.client.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public ModelAndView showGuideAdd() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("guide",new Guide());
		modelAndView.setViewName("guide-add");
		return modelAndView;
	}
	
	@RequestMapping(value={"/guide-add.html"}, method = RequestMethod.POST)
	public ModelAndView createGuide(@Valid Guide guide,BindingResult bindingResult) {
		return null;
		
	}
	
	@RequestMapping(value={"/guide-list.html"}, method = RequestMethod.GET)
	public ModelAndView listGuide() {
		ModelAndView modelAndView = new ModelAndView();
		List<Guide> guidelist = guideService.findAll();
		modelAndView.addObject("guidelist",guidelist);
		modelAndView.setViewName("guide-list");
		return modelAndView;
	}
}
