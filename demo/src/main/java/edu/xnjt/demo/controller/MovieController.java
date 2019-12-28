package edu.xnjt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.Movie;
import edu.xnjt.demo.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	MovieService movieService;
	
	@RequestMapping("/getList")
	public List<Movie> getList(){
		return movieService.getList();
	}

}
