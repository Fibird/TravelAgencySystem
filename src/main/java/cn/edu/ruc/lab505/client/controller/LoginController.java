package cn.edu.ruc.lab505.client.controller;

import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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

import cn.edu.ruc.lab505.client.model.T_user;
import cn.edu.ruc.lab505.client.model.User;
import cn.edu.ruc.lab505.client.model.Userrequest;
import cn.edu.ruc.lab505.client.service.TuserService;
import cn.edu.ruc.lab505.client.service.UserService;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private TuserService tuserService;

	    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
	    public ModelAndView login(){
	        //从数据库取出数据  
	        List<User> users = userService.findAll();  
	        ModelAndView mav = new ModelAndView();  
	        mav.setViewName("login_lcy");  
	        mav.addObject("User", new User());  
	        mav.addObject("Userlist", users);  
	        return mav;  
	    }
    
	  @RequestMapping(value={"/user-list.html"}, method = RequestMethod.GET)
	  public ModelAndView ulist(){
	      //从数据库取出数据  
	      List<T_user> users = tuserService.findAll();  
	      ModelAndView mav = new ModelAndView();  
	      mav.setViewName("user-list");  
	      mav.addObject("t_user", new T_user());  
	      mav.addObject("T_userlist", users); 
	      System.out.println("Now you are in user-list.html, list size = " + Integer.toString(users.size()));
	      return mav;  
	  }
	  
//		@RequestMapping(value={"/addairline"}, method = RequestMethod.GET)
//		public ModelAndView AirlineAddHtml() {
//			ModelAndView modelAndView = new ModelAndView();
////			airlineService.saveAirline(airline);
////			modelAndView.addObject("successMessage", attributeValue);
//			modelAndView.setViewName("user-add");
//			modelAndView.addObject("t_user", new T_user());  
//			return modelAndView;
//		}
	  
	  @RequestMapping(value={"/adduser"}, method = RequestMethod.GET)
	  public ModelAndView tuserlist(){
	      //从数据库取出数据  
	      List<T_user> users = tuserService.findAll();  
	      ModelAndView mav = new ModelAndView();  
	      mav.setViewName("user-add");  
	      mav.addObject("t_user", new T_user());  
	      mav.addObject("T_userlist", users); 
	      System.out.println("Now you are in login methos=get");
	      return mav;  
	  }
  
	  @RequestMapping(value={"/adduser"}, method = RequestMethod.POST)
	  public ModelAndView createTUser(@Valid T_user t_user, BindingResult bindingResult) {
	      System.out.println("1234");
		  ModelAndView modelAndView = new ModelAndView();
//	      User userExists = tuserService.findUserByEmail(user.getEmail());
//	      if (userExists != null) {
//	          bindingResult
//	                  .rejectValue("email", "error.user",
//	                          "There is already a user registered with the email provided");
//	      }
//	      if (bindingResult.hasErrors()) {
//	          modelAndView.setViewName("registration");
//	      } else {
//	    	  tuserService.save(user);
//	          modelAndView.addObject("successMessage", "User has been registered successfully");
//	          modelAndView.addObject("user", new User());
//	          modelAndView.setViewName("registration");
//	
//	      }
	      System.out.println(t_user.getEmail());
	      tuserService.save(t_user);
	      modelAndView.setViewName("user-add");;
	      return modelAndView;
	  }
    
//    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
//    public ModelAndView login(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("login_lcy");
//        return modelAndView;
//    }

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
            modelAndView.setViewName("login_lcy");
        }
        return modelAndView;
    }
    
    @RequestMapping(value="/index-1", method = RequestMethod.GET)
    public ModelAndView showindex(){
        ModelAndView modelAndView = new ModelAndView();
        Userrequest userrequest = new Userrequest();
        modelAndView.addObject("userrequest", userrequest);
        modelAndView.setViewName("showindex");
        return modelAndView;
    }

    @RequestMapping(value = "/index-1", method = RequestMethod.POST)
    public ModelAndView request_post(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("aaaaaaaaaaaaaaaa");
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
              modelAndView.setViewName("index-1");
          }
          else {
        	  modelAndView.addObject("memberMessage","Content Available Only for Users with Root Role");
        	  modelAndView.setViewName("index-2");
          }
          return modelAndView;
    }
}
