package com.s1626022055.b;
import java.util.List;

import com.s1626022055.a.*;
public interface StudentMapper {
	public Student findStudentById(Integer id);
	public List<Student> findStudentByUsername(String username);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(Integer id);
}
