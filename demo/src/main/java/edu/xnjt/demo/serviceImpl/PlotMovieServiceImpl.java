package edu.xnjt.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.xnjt.demo.mapper.PlotMovieMapper;
import edu.xnjt.demo.mapper.TerroristMovieMapper;
import edu.xnjt.demo.model.PlotMovie;
import edu.xnjt.demo.model.TerroristMovie;
import edu.xnjt.demo.service.PlotMovieService;


@Service
public class PlotMovieServiceImpl implements PlotMovieService {

	@Autowired
	PlotMovieMapper plotmovieMapper;
	@Override
	public List<PlotMovie> getPlotList() {
		// TODO Auto-generated method stub
		return plotmovieMapper.selectLoveMovies() ;
	}
	
	}
    
	
	
