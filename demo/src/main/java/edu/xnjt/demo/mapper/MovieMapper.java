package edu.xnjt.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.xnjt.demo.model.Movie;

@Mapper
public interface MovieMapper {
     public List<Movie> selectLoveMovies();
}
