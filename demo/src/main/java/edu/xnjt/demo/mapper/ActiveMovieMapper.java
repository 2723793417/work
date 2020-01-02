package edu.xnjt.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.xnjt.demo.model.ActiveMovie;

@Mapper
public interface ActiveMovieMapper {
 public List<ActiveMovie> selectLoveMovies();
}
