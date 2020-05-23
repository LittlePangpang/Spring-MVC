package s1626022055.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import s1626022055.dao.StudentDao;
import s1626022055.po.Student;
import s1626022055.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
//注解注入StudentDao
	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student> findStudentById(Integer id) {
		List<Student> students = studentDao.findStudentById(id);
	    return students;		
	}
	
	@Override
	public List<Student> findAllStudent() {
		List<Student> students = studentDao.findAllStudent();
	    return students;
	}
	@Override
	public int addStudent(Student s) {
		return studentDao.addStudent(s);
		
	}
	@Override
	public int updateStudent(Student s) {
		return studentDao.updateStudent(s);
	}
	
	@Override
	public int deleteStudent(Integer id) {
		return studentDao.deleteStudent(id);
		
	}

}
