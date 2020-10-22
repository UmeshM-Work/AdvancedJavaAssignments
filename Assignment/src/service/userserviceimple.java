package service;

import java.util.ArrayList;

import dao.userdao;
import dao.userdaoimple;
import dto.User;

public class userserviceimple implements userservice{

	private userdao UserDao;
	
	public userserviceimple()
	{
		UserDao=new userdaoimple() ;
	}
	
	
	@Override
	public int registerUse(User user) {
		
		return UserDao.insert(user);
	}

	@Override
	public boolean login1(User user) {
		
		return UserDao.login(user);
	}


	@Override
	public ArrayList<User> selectAll(String user_name) {
		// TODO Auto-generated method stub
		return UserDao.selectAll(user_name);
	}

}
