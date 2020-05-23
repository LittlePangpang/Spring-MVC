package com.s1626022055.ioc;

public class Student {

	private String no;
	private String name;
	private Integer age;
	
	public Student() {
		super();
	};
	public Student(String no, String name, Integer age) {
		super();
		this.no=no;
		this.name=name;
		this.age=age;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	//@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	//@Override
	public void sayHello() {
		System.out.println("Hello! I am "+ name +", and my xuehao is "+ no + ", and my age is "+ age + ".   GoodBye!!!"); 
	}
}
