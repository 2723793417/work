package edu.xnjt.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.xnjt.demo.model.Film;
import edu.xnjt.demo.service.FilmService;

@RestController
@RequestMapping("/administrator")
public class FilmController {
@Autowired
 FilmService filmService;

	@RequestMapping("/addmovie")
	public int addFilm(Film film ) {
	  Film f=new Film();
	  f.setMname("猪猪侠");
	  f.setInto("猪猪侠");
	  f.setStarring("猪猪侠");
	  f.setDirector("猪猪侠");
	  f.setImgurl("猪猪侠");
 	return filmService.addFilm(f);
	}
		@RequestMapping("/updatemovie")
		public int updataFilm(Film film){
			return filmService.updateFilm(film);
			
}

       @RequestMapping("/deletemovie")
	    public int deleteFilm(Film film) {
    	   return filmService.deleteFilm(film);
}
     @RequestMapping("/getmovieById")
     public Film getFilmById(Film film) {
    	 return filmService.getFilmById(film);
     }
     @RequestMapping("/getAllmovie")
     public Object findAllFilm() {
    	 return filmService.findAllFilm();
     }
}