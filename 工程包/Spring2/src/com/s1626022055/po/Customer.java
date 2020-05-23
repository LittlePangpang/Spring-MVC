package com.s1626022055.po;
/**
 * 学生持久化类
 */
public class Customer {
	private Integer id;       // 主键id
	private String loginname; // 登录名
	private String password;      // 密码
	private String username;     // 用户名
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
	@Override
	public String toString() {
		return "Customer [id=" + id + ", loginname=" + loginname + 
				       ", password=" + password + ", username=" + username + "]";
	}
}
