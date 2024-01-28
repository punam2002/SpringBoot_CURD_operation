package com.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="StudentId")
private int StudentId;

@Column(name="Student_Name")
private String Student_Name;

@Column(name="City")
private String City;

@Column(name="Email")
private String Email;

@Column(name="Contact")
private String Contact;

@Column(name="Course")
private String Course;

public int getStudentId() {
	return StudentId;
}

public void setStudentId(int studentId) {
	StudentId = studentId;
}

public String getStudent_Name() {
	return Student_Name;
}

public void setStudent_Name(String student_Name) {
	Student_Name = student_Name;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getContact() {
	return Contact;
}

public void setContact(String contact) {
	Contact = contact;
}

public String getCourse() {
	return Course;
}

public void setCourse(String course) {
	Course = course;
}

}
