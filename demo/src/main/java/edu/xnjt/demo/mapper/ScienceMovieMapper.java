package edu.xnjt.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.xnjt.demo.model.ScienceMovie;

@Mapper
public interface ScienceMovieMapper {
 public List<ScienceMovie> selectLovemMovies();
}
