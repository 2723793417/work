package edu.xnjt.demo.mapper;

import org.apache.ibatis.annotations.Mapper;


import edu.xnjt.demo.model.UserLogin;

@Mapper
public interface LoginMapper {
	public UserLogin  selectUserByUsername(String username);
    
    
    public int insertUser(UserLogin user);
}	


