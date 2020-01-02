package edu.xnjt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.ActiveMovie;
import edu.xnjt.demo.service.ActiveMovieService;

@RestController
@RequestMapping("/movies")
public class ActiveMovieController {
@Autowired
ActiveMovieService activeMovieService;

@RequestMapping("/getActive")
public List<ActiveMovie> getActiveList(){
	return activeMovieService.getActiveList();
}
}