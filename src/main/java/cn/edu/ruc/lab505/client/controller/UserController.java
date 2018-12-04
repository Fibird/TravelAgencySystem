package cn.edu.ruc.lab505.client.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.ruc.lab505.client.model.*;
import cn.edu.ruc.lab505.client.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = {"/user-add.html"}, method = RequestMethod.GET)
	public ModelAndView addUser() {
		User user = new User();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user-add");
		return modelAndView;
	}

	@RequestMapping(value = { "/user-add.html" }, method = RequestMethod.POST)
	public ModelAndView addUserToDB(@Valid User user, BindingResult bindingResult) {
		userService.saveUser(user);
		ModelAndView modelAndView = new ModelAndView();
		List<User> userlist = userService.findAll();
		modelAndView.addObject("userlist", userlist);
		modelAndView.setViewName("user-list");
		return modelAndView;
	}

	@RequestMapping(value = { "/user-list.html" }, method = RequestMethod.GET)
	public ModelAndView ulist() {
		List<User> users = userService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("userlist", users);
		mav.setViewName("user-list");
		return mav;
	}
}
