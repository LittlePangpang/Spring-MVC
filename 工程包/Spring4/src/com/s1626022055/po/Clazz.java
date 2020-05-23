package com.s1626022055.po;

import java.util.List;

public class Clazz {
	private Integer id;       // 主键id
	private String cname; // 班级名
	private List<Student> studentList; //用户关联的订单
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student> getstudentList() {
		return studentList;
	}
	public void setstudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", studentList=" + studentList + "]";
	}
}