package com.s1626022055.s.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.s1626022055.a.Student;
import com.s1626022055.b.StudentMapper;
import com.s1626022055.s.StudentService;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public Student findStudentById(Integer id) {
		Student student=this.studentMapper.findStudentById(id);
		return student;
	}
	@Override
	public List<Student> findStudentByUsername(String username) {
		List<Student> students=this.studentMapper.findStudentByUsername(username);
		return students;
	}
	@Override
	public void addStudent(Student student) {
		this.studentMapper.addStudent(student);

	}
	@Override
	public void updateStudent(Student student) {
		this.studentMapper.updateStudent(student);
		int i=1/0;
	}
	@Override
	public void deleteStudent(Integer id) {
		this.studentMapper.deleteStudent(id);
		
	}
}