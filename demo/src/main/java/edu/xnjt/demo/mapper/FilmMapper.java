package edu.xnjt.demo.mapper;

import edu.xnjt.demo.model.Film;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper


public interface FilmMapper {
	public int addFilm(Film user);
	 
   public int deleteFilm(Film user);
 
   public int updateFilm(Film user);
 
   public Film getFilmById(Film user);
 
  public  List<Film> selectAllFilm();


}
