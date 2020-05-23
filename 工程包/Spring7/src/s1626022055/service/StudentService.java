package s1626022055.service;

import java.util.List;

import s1626022055.po.Student;

public interface StudentService {

	public List<Student> findStudentById(Integer id);
	
	public List<Student> findAllStudent();

	public int addStudent(Student s);

	public int updateStudent(Student s);

	public int deleteStudent(Integer id);

}
