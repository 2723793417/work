package edu.xnjt.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.MovieMapper;
import edu.xnjt.demo.mapper.TerroristMovieMapper;
import edu.xnjt.demo.model.Movie;
import edu.xnjt.demo.model.TerroristMovie;
import edu.xnjt.demo.service.MovieService;
import edu.xnjt.demo.service.TerroristMovieService;

@Service
public class TerroristMovieServiceImpl implements TerroristMovieService {
	@Autowired
	TerroristMovieMapper terroristmovieMapper;
	@Override
	public List<TerroristMovie> getTerroristList() {
		// TODO Auto-generated method stub
		return terroristmovieMapper.selectLoveMovies() ;
	}
    
	
	}
