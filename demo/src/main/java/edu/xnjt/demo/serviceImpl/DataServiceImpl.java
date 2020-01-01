package edu.xnjt.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.DataMapper;
import edu.xnjt.demo.model.Data;
import edu.xnjt.demo.service.DataService;

@Service
public class DataServiceImpl implements DataService {
	@Autowired
	DataMapper dataMapper;
	@Override
	public int MovieData(Data Movie) {
		// TODO Auto-generated method stub
		
		Data d = dataMapper.selectMoviename(Movie.getMname());
		int i =0;
		if(d==null) {
			i=dataMapper.insertMoviename(Movie);
		}else {
			i=2;
		}
		return i;
		
		
	}
	
	}
	


