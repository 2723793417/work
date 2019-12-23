package edu.xnjt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.SysUser;
import edu.xnjt.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")//处理的全是user的映射
public class UserController {
	@Autowired //注入service
	UserService userService;
	
	@RequestMapping("/register")
	public JSONObject register(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		//调用service
		int i = userService.register(user);
		
		result.put("state", i);
		return result;
	}
}
