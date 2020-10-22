package dao;

import java.util.ArrayList;

import dto.User;

public interface userdao {
	
	int insert(User user);
	boolean login(User user);
	
	ArrayList<User> selectAll(String user_name);
	

}
