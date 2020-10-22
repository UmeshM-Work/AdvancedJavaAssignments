package dto;

public class User {

	@Override
	public String toString() {
		return user_id + " "+ user_fname +" " + user_name + " " + user_pass;
	}
	private int user_id;
	private String user_fname;
	private String user_name;
	private String user_pass;
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public User() {
		
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	
	
	
	
}
