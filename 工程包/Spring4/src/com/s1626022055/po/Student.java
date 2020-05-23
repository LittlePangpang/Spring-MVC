package com.s1626022055.po;

import com.s1626022055.po.Clazz;

public class Student {
	private Integer id;       // 主键id
	private String loginname; // 登录名
	private String password;      // 密码
	private String username;  // 用户名
	private Integer clazz_id; //班级id
    private Clazz clazz;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getclazz_id() {
		return clazz_id;
	}
	public void setclazz_id(Integer clazz_id) {
		this.clazz_id = clazz_id;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", loginname=" + loginname + ", password=" + password + ", username=" + username
				+ ", clazz_id=" + clazz_id + ", clazz=" + clazz + "]";
	}
}