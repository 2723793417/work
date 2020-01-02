package edu.xnjt.demo.service;

import edu.xnjt.demo.model.Film;

import java.util.List;



public interface FilmService {

	  public int addFilm(Film film);
	 
	  public int deleteFilm(Film film);
 
	  public  int updateFilm(Film film);
 
	  public   Film getFilmById(Film film);
 
	  public  List<Film> findAllFilm();
}
