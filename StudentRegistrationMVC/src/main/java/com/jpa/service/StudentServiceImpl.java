package com.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.model.Student;
import com.jpa.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
private StudentRepo studrepo;
	@Override
	public List<Student> getAllStudents() {
		return studrepo.findAll();
	}

	@Override
	public void saveStudents(Student student) {
	this.studrepo.save(student);
		
	}

	@Override
	public Student getStudentById(int id) {
	Optional<Student> option=studrepo.findById(id);
	Student student=null;
	if(option.isPresent()) {
		student=option.get();
		}else {
			throw new RuntimeException("Student Not Found : "+id);
		}
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		this.studrepo.deleteById(id);
	}

}
