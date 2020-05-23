package s1626022055.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import s1626022055.po.Student;
import s1626022055.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	/**
	 * 创建学生
	 */
	@RequestMapping("/add.action")
	public String addStudent(Student student,Model model) {
		int rows = studentService.addStudent(student);
	    if(rows > 0){
//	    	List<Student> students = studentService.findAllStudent();
//			model.addAttribute("students", students);
//	        return "showStudent";
	    	return "redirect:findAll.action";
	    }else{
	    	return "fail";
	    }
	}

	/**
	 * 通过id获取客户信息
	 */
	@RequestMapping("/find.action")
	public String findStudentById(Integer id,Model model) {
		List<Student> student = studentService.findStudentById(id);
		model.addAttribute("students", student);
		//返回学生信息展示页面
		return "showStudent";
	}
	/**
	 * 查询所有学生信息
	 */
	@RequestMapping("/findAll.action")
	public String findAll(Model model) {
		List<Student> student = studentService.findAllStudent();
		model.addAttribute("students", student);
		//返回学生信息展示页面
		return "showStudent";
	}
	/**
	 * 更新客户
	 */
	@RequestMapping("/search")
	public String studentSearch(Integer id,Model model) {
		List<Student> student = studentService.findStudentById(id);
		model.addAttribute("student", student);
		return "editStudentById";
	}
	@RequestMapping("/update.action")
	public String studentUpdate(Student student, Model model) {
	    int rows = studentService.updateStudent(student);
	    if(rows > 0){
//	    	List<Student> students = studentService.findAllStudent();
//			model.addAttribute("students", students);
//	        return "showStudent";
	    	return "redirect:findAll.action";
	        
	    }else{
	        return "fail";
	    }
	}

	/**
	 * 删除客户
	 */
	@RequestMapping("/delete.action")
	public String studentDelete(Integer id,Model model) {
	    int rows = studentService.deleteStudent(id);
	    if(rows > 0){		
//	    	List<Student> student = studentService.findAllStudent();
//			model.addAttribute("students", student);
//	        return "showStudent";
	        return "redirect:findAll.action";
	    }else{
	    	System.out.println("rows="+rows);
	        return "fail";			
	    }
	}
	
	
	@RequestMapping("/searchStudentById")
	public String findStudent() {
		return "searchStudentById";
	}
	@RequestMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	@RequestMapping("/updateStudentById")
	public String updateStudent() {
		return "updateStudentById";
	}
	@RequestMapping("/editStudentById")
	public String editStudent() {
		return "editStudentById";
	}
	@RequestMapping("/deleteStudentById")
	public String deleteStudent() {
		return "deleteStudentById";
	}
}
