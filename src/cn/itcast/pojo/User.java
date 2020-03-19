package cn.itcast.pojo;

import java.sql.Timestamp;

public class User {
	private int id;
	private String username;
	private String password;
	private String nickname;
	private Timestamp RegistrationDate;
	public Timestamp getRegistrationDate() {
		return RegistrationDate;
	}
	public void setRegistrationDate(Timestamp registrationDate) {
		RegistrationDate = registrationDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
