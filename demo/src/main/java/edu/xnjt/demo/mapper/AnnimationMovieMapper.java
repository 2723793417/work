package edu.xnjt.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.xnjt.demo.model.AnnimationMovie;

@Mapper
public interface AnnimationMovieMapper {
 public List<AnnimationMovie> selectLoveMovies();
}