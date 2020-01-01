package edu.xnjt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.Data;
import edu.xnjt.demo.service.DataService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/movie")//处理movie的映射
public class DataController {
	@Autowired
	DataService dataService;
	@RequestMapping("/data")
	public JSONObject data(@RequestBody Data movie) {
		JSONObject result = new JSONObject();
		int i=  dataService.MovieData(movie);
		
		result.put(movie, i);
		
		return result;
	
	  

	}
}
