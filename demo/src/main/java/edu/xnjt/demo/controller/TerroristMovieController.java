package edu.xnjt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.TerroristMovie;
import edu.xnjt.demo.service.TerroristMovieService;

@RestController
@RequestMapping("/movies")
public class TerroristMovieController {
	@Autowired
	TerroristMovieService terroristmovieService;
	
	@RequestMapping("/getTerroristList")
	public List<TerroristMovie> getTerroristList(){
		return terroristmovieService.getTerroristList();
	}

}