package edu.xnjt.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.xnjt.demo.model.FantasyMovie;

@Mapper
public interface FantasyMovieMapper {
public List<FantasyMovie> selectLoveMovies();
}
