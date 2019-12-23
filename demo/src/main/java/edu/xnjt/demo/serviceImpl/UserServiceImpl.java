package edu.xnjt.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.UserMapper;
import edu.xnjt.demo.model.SysUser;
import edu.xnjt.demo.service.UserService;

@Service

public class UserServiceImpl   implements  UserService{
   @Autowired
   UserMapper userMapper;
	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		//调用·mapper实现注册
		
		SysUser u0 = userMapper.selectUserByUsername(user.getUsername());
		int i = -1;
		if(u0==null) {
			userMapper.insertUser(user);
		}else {
			i= 2;
		}
		
		
		return i;
		
		
	}
              
}
