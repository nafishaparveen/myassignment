package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java {
	@Value("abcdefg")
	private String dburl;
	@Value("nafishaparveen")
	private String username;
	@Value("nafu@12")
	private String password;
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
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
	@Override
	public String toString() {
		return "Java [dburl=" + dburl + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
