package edu.xnjt.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xnjt.demo.mapper.LoginMapper;
import edu.xnjt.demo.model.UserLogin;
import edu.xnjt.demo.service.LoginService;


@Service
public class LoginServiceImpl implements  LoginService {
	@Autowired
	LoginMapper loginMapper;
	@Override
	public int login(UserLogin user) {
		// TODO Auto-generated method stub
		UserLogin u0 = loginMapper.selectUserByUsername(user.getUsername());
	  int i = 0;       //登录时查询数据库有没这个人 无 则先返回0(注册)
		if(u0==null) {
			loginMapper.insertUser(user);
		}else {
			i= 1;//表示登陆成功
		}
		
		
		return i;
		
	}
	
	}
	
	

