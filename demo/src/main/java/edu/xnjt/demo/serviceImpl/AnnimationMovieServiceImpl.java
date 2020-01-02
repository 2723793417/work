package edu.xnjt.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.AnnimationMovieMapper;
import edu.xnjt.demo.model.AnnimationMovie;
import edu.xnjt.demo.service.AnnimationMovieService;

@Service
public class AnnimationMovieServiceImpl implements AnnimationMovieService {

	@Autowired
	AnnimationMovieMapper annimationMovieMapper;
	@Override
	public List<AnnimationMovie> getAnnimationList(){
		// TODO Auto-generated method stub
		return annimationMovieMapper.selectLoveMovies();
	}
	}