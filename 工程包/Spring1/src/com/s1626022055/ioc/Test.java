package com.s1626022055.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext act=new ClassPathXmlApplicationContext("com/s1626022055/ioc/applicationContext.xml");	
		Student student1 = (Student) act.getBean("stu1");
		Student student2 = (Student) act.getBean("stu2");
//		Student student3 = (Student) act.getBean("stu3");
		
		//System.out.println(student1);
		student1.sayHello();
		student2.sayHello();
//		student3.sayHello();
		
	}

}
