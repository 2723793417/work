package edu.xnjt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.AnnimationMovie;
import edu.xnjt.demo.service.AnnimationMovieService;

@RestController
@RequestMapping("/movies")
public class AnnimationMovieController {

	@Autowired
	AnnimationMovieService annimationMovieService;
	@RequestMapping("/getAnnimation")
	public List<AnnimationMovie> getAnnimationList(){
		return annimationMovieService.getAnnimationList();
	}
}
