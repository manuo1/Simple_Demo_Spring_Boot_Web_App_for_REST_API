package com.manuo1.web_app.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.manuo1.web_app.users.model.User;
import com.manuo1.web_app.users.service.UserService;

@Controller
public class UserController {
   
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
    public String home() {
        return "index";
	}
	
	@GetMapping("/all_users")
	public String home(Model model) {
	    Iterable<User> usersList = userService.getAllUsers();
	    model.addAttribute("userslist", usersList);
	    
	    return "all_users";
	}
}
