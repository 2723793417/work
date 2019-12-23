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
		//查询数据库 是否重名
		SysUser u0 = userMapper.selectUserByUsername(user.getUsername());
		int i = 0;
		if(u0==null) {
			//用户不存在 再插入用户
			userMapper.insertUser(user);
		}else {
			i= 1;
		}
		
		
		return i;
		
		
	}
              
}
