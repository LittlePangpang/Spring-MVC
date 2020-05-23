package com.s1626022055.po;

public class Customer {
	private int id;  //用户ID
	private String username; // 客户名称
	private String telephone;  //电话号
	private String sex;  //性别
	private int age;  //年龄
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", telephone=" + telephone + ", sex=" + sex + ", age="
				+ age + "]";
	}

}
