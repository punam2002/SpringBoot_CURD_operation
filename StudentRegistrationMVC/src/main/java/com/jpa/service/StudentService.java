package com.jpa.service;

import java.util.List;

import com.jpa.model.Student;

public interface StudentService {
List <Student> getAllStudents();
void saveStudents(Student student);
Student getStudentById(int id);
void deleteStudent(int id);

}
