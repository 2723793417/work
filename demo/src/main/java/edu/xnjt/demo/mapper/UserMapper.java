package edu.xnjt.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.xnjt.demo.model.SysUser;

@Mapper
public interface UserMapper {
	
            public SysUser selectUserByUsername(String username);
            
            
            public int insertUser(SysUser user);
}	
            

