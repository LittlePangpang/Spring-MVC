package com.s1626022055.po;
/**
 * ѧ���־û���
 */
public class Customer {
	private Integer id;       // ����id
	private String loginname; // ��¼��
	private String password;      // ����
	private String username;     // �û���
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
