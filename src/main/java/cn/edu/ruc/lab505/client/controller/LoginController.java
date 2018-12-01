package cn.edu.ruc.lab505.client.controller;

import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import cn.edu.ruc.lab505.client.model.*;
import cn.edu.ruc.lab505.client.service.TuserService;
import cn.edu.ruc.lab505.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private TuserService tuserService;

//    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
//    public ModelAndView login(){
//        //从数据库取出数据  
//        List<User> users = userService.findAll();  
//        ModelAndView mav = new ModelAndView();  
//        mav.setViewName("test");  
//        mav.addObject("User", new User());  
//        mav.addObject("Userlist", users);  
//        return mav;  
//    }
    
//  @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
//  public ModelAndView login(){
//      //从数据库取出数据  
//      List<T_user> users = tuserService.findAll();  
//      ModelAndView mav = new ModelAndView();  
//      mav.setViewName("index-2");  
//      mav.addObject("T_user", new T_user());  
//      mav.addObject("T_userlist", users);  
//      return mav;  
//  }
    
    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login_lcy");
        return modelAndView;
    }

    @RequestMapping(value={"/list"}, method = RequestMethod.GET)
    public ModelAndView userlist(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        return modelAndView;
    }
    
    @RequestMapping(value="/registration", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("registration");
        }
        return modelAndView;
    }

//    @RequestMapping(value="/home", method = RequestMethod.GET)
//    public ModelAndView home(){
//        ModelAndView modelAndView = new ModelAndView();
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        User user = userService.findUserByEmail(auth.getName());
//        modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
//        modelAndView.addObject("memberMessage","Content Available Only for Users with Member Role");
//        modelAndView.setViewName("home");
//        return modelAndView;
//    }
    
    @RequestMapping(value="/home", method = RequestMethod.GET)
    public ModelAndView dispatch(ModelMap model, HttpServletRequest request) {
    	ModelAndView modelAndView = new ModelAndView();
//    	String path = request.getContextPath() ;
//        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
          Set<String> roles = AuthorityUtils.authorityListToSet(SecurityContextHolder.getContext()
                  .getAuthentication().getAuthorities());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Welcome " + user.getName() + " " + " (" + user.getEmail() + ")");

          if (roles.contains("USER")) {
        	  modelAndView.addObject("memberMessage","Content Available Only for Users with User Role");
              modelAndView.setViewName("home");
          }
          else {
        	  modelAndView.addObject("memberMessage","Content Available Only for Users with Root Role");
        	  modelAndView.setViewName("index");
          }
          return modelAndView;
    }
}
