package edu.xnjt.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.xnjt.demo.model.PlotMovie;

@Mapper
public interface PlotMovieMapper {
     public List<PlotMovie> selectLoveMovies();
}
