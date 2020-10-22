package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.mycon;
import dto.User;

public class userdaoimple implements userdao {

	private mycon MyCon;
	
	public userdaoimple()
	{
		MyCon=new mycon();
	}
	
	@Override
	public int insert(User user) {
		int i=0;
		try {
			Connection con=MyCon.getConn();
			PreparedStatement s=con.prepareStatement("insert into user2(user_fname,user_name,user_pass)values(?,?,?)");
			s.setString(1, user.getUser_fname());
			s.setString(2, user.getUser_name());
			s.setString(3, user.getUser_pass());
			i=s.executeUpdate();
			s.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		
			
		}
		
		
		
		return i;
	}

	@Override
	public boolean login(User user) {
		boolean flag = false;
		try {
			Connection con = MyCon.getConn();
			PreparedStatement s = con.prepareStatement(
			"select * from user2 where user_name = ? and user_pass = ?");
			s.setString(1, user.getUser_name());
			s.setString(2, user.getUser_pass());
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				user.setUser_id(rs.getInt("user_id"));
				flag = true;
			}
			s.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public ArrayList<User> selectAll(String user_name) {
		ArrayList<User> al = new ArrayList<>();
		try {
		Connection con = MyCon.getConn();
		PreparedStatement s = con.prepareStatement("select * from expense where user_name = ?");
		s.setString(1, user_name);
		ResultSet rs = s.executeQuery();
		while(rs.next()) {
			User us = new User();
			us.setUser_fname(rs.getString("user_fname"));
			
			us.setUser_name(rs.getString("user_name"));
			
		 
			al.add(us);
		}
		s.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return al;
	}

}
