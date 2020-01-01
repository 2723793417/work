package edu.xnjt.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import edu.xnjt.demo.model.TerroristMovie;

@Mapper
public interface TerroristMovieMapper {
     public List<TerroristMovie> selectLoveMovies();
}
