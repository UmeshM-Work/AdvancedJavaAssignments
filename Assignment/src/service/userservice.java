package service;

import java.util.ArrayList;

import dto.User;

public interface userservice{

	int registerUse(User user);
	boolean login1(User user);	
	ArrayList<User> selectAll(String user_name);
	
}
