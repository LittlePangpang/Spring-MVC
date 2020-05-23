package s1626022055.dao;

import java.util.List;

import s1626022055.po.Student;

/*
 * Student接口文件
 */
public interface StudentDao {
	// 根据Id查询
	public List<Student> findStudentById(Integer id);

	// 查询所有学生信息
	public List<Student> findAllStudent();

	// 插入学生
	public int addStudent(Student s);

	// 更新
	public int updateStudent(Student s);

	// 删除
	public int deleteStudent(Integer id);
}
