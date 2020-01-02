package edu.xnjt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.FantasyMovie;
import edu.xnjt.demo.service.FantasyMovieService;

@RestController
@RequestMapping("/movies")
public class FantasyMovieController {
  @Autowired
  FantasyMovieService fantasyMovieService;
  @RequestMapping("/getFantasy")
  public List<FantasyMovie> getFantasyList(){
	  return fantasyMovieService.getFantasyList();
  }
}
