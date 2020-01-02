package edu.xnjt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.ScienceMovie;
import edu.xnjt.demo.service.ScienceMovieService;

@RestController
@RequestMapping("/movies")
public class ScienceMovieController {

	@Autowired
	ScienceMovieService scienceMovieService;
	@RequestMapping("/getScience")
	public List<ScienceMovie> getScienceList(){
		return scienceMovieService.getScienceList();
	}
}
