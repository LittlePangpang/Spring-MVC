package com.s1626022055.po;
/**
 * 客户持久化类
 */
public class Customer {
	private Integer id;       // 主键id
	private String loginname; // 客户名称
	private String password;      // 职业
	private String username;     // 电话
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String username) {
		this.loginname = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String jobs) {
		this.password = jobs;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String phone) {
		this.username = phone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", loginname=" + loginname + 
				       ", password=" + password + ", username=" + username + "]";
	}
}
