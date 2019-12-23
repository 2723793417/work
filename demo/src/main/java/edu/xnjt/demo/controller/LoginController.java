package edu.xnjt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.UserLogin;
import edu.xnjt.demo.service.LoginService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class LoginController {
	@Autowired //注入service
	
	LoginService loginService;
	
	
	@RequestMapping("/login")
	public JSONObject login(@RequestBody UserLogin user) {
		JSONObject result = new JSONObject();
	
	    int i = loginService.login(user);
		result.put("state", i);
		return result;
		
	}
       
}