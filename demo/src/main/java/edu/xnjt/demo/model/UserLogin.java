package edu.xnjt.demo.model;

public class UserLogin {
	int UId;
	String username;
	String password;
	@Override
	public String toString() {
		return "UserLogin [UId=" + UId + ", username=" + username + ", password=" + password + ", getUId()=" + getUId()
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getUId() {
		return UId;
	}
	public void setUId(int uId) {
		UId = uId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
