package edu.xnjt.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.MovieMapper;
import edu.xnjt.demo.model.Movie;
import edu.xnjt.demo.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    
	@Autowired
	MovieMapper movieMapper;
	@Override
	public List<Movie> getList() {
		// TODO Auto-generated method stub
		return movieMapper.selectLoveMovies() ;
	}
     
}
