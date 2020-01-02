package edu.xnjt.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.ScienceMovieMapper;
import edu.xnjt.demo.model.ScienceMovie;
import edu.xnjt.demo.service.ScienceMovieService;

@Service
public class ScienceMovieServiceImpl implements ScienceMovieService{

	@Autowired
	ScienceMovieMapper scienceMovieMapper;
	@Override
	public List<ScienceMovie> getScienceList(){
		// TODO Auto-generated method stub
		return scienceMovieMapper.selectLovemMovies();	
	}
}
