package edu.xnjt.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.FilmMapper;
import edu.xnjt.demo.model.Film;
import edu.xnjt.demo.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService{

	@Autowired(required = false)
	
	private FilmMapper filmMapper;

	@Override
	public int addFilm(Film film) {
		// TODO Auto-generated method stub
		return filmMapper.addFilm(film);
	}

	@Override
	public int deleteFilm(Film film) {
		// TODO Auto-generated method stub
		return filmMapper.deleteFilm(film);
	}

	@Override
	public int updateFilm(Film film) {
		// TODO Auto-generated method stub
		return filmMapper.updateFilm(film);
	}

	@Override
	public Film getFilmById(Film film) {
		// TODO Auto-generated method stub
		return filmMapper.getFilmById(film);
	}

	@Override
	public List<Film> findAllFilm(){
		// TODO Auto-generated method stub
		return filmMapper.selectAllFilm();
	}
	
	
	
}
