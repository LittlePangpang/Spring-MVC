package com.s1626022055.c;

import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.s1626022055.a.Student;
import com.s1626022055.s.StudentService;

public class JTest {
	/**
	 * 添加
	 */
	@Test
	public void addStudentTest() throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = act.getBean(StudentService.class);
		Student student1 = new Student();
		student1.setLoginname("stu01");
		student1.setPassword("123");
		student1.setUsername("aaaaa");
		studentService.addStudent(student1);
		Student student2 = new Student();
		student2.setLoginname("stu02");
		student2.setPassword("234");
		student2.setUsername("bbbb");
		studentService.addStudent(student2);
		Student student3 = new Student();
		student3.setLoginname("stu03");
		student3.setPassword("345");
		student3.setUsername("ccccc");
		studentService.addStudent(student3);
		Student student4 = new Student();
		student4.setLoginname("stu04");
		student4.setPassword("456");
		student4.setUsername("fffff");
		studentService.addStudent(student4);

	}

	/**
	 * 更新
	 */
	@Test
	public void updateStudentTest() throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = act.getBean(StudentService.class);
		Student student = new Student();
		student.setId(12);
		student.setLoginname("123123123");
		student.setPassword("123123q");
		student.setUsername("33333");
		studentService.updateStudent(student);
	}

	/**
	 * 根据id查找
	 */
	@Test
	public void findStudentByIdTest() throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = act.getBean(StudentService.class);
		Student student = studentService.findStudentById(12);
		System.out.println(student.toString());
	}

	/**
	 * 根据username查找
	 */
	@Test
	public void findStudentByNameTest() throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = act.getBean(StudentService.class);
		List<Student> students = studentService.findStudentByUsername("ccccc");
		for (Student student : students) {

			System.out.println(student);
		}
	}

	/**
	 * 删除
	 */
	@Test
	public void deleteStudentTest() throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = act.getBean(StudentService.class);
		studentService.deleteStudent(19);
	}
}
