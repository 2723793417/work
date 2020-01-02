package edu.xnjt.demo.serviceImpl;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import edu.xnjt.demo.mapper.ActiveMovieMapper;
	import edu.xnjt.demo.model.ActiveMovie;
	import edu.xnjt.demo.service.ActiveMovieService;

	@Service
	public class ActiveMovieServiceImpl implements ActiveMovieService{
	@Autowired
	ActiveMovieMapper activeMovieMapper;
	@Override
	public List<ActiveMovie> getActiveList(){
		// TODO Auto-generated method stub
		return activeMovieMapper.selectLoveMovies();
	}
	}


