package edu.xnjt.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.xnjt.demo.model.Data;

@Mapper
public interface DataMapper {
	public Data selectMoviename(String moviename);
	public int   insertMoviename(Data movie);
            
}
