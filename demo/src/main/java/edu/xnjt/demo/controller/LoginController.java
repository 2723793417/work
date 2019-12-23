package edu.xnjt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.UserLogin;
import edu.xnjt.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class LoginController {
	@Autowired //注入service
	
	UserService userService;
	
	
	@RequestMapping("/Login")
	
	public UserLogin Login() {
		
		
		int i = userService.login(user);
		return null;
		
	}
       
}