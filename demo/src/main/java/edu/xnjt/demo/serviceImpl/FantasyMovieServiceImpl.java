package edu.xnjt.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.FantasyMovieMapper;
import edu.xnjt.demo.model.FantasyMovie;
import edu.xnjt.demo.service.FantasyMovieService;

@Service
public class FantasyMovieServiceImpl implements FantasyMovieService {
@Autowired
FantasyMovieMapper fantasyMovieMapper;
@Override
public List<FantasyMovie> getFantasyList(){
	// TODO Auto-generated method stub
	return  fantasyMovieMapper.selectLoveMovies();
}
}
