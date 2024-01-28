package com.jpa;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Student {

@NotNull(message="is required")
@Size(min=4,max=10)
	private String FirstName;
@NotNull(message="is required")
@Size(min=4,max=10)
	private String LastName;
@NotEmpty
@Size(min=1, max=3)
	private String RollNo;
@NotNull
@Email(message = "Please enter a valid e-mail address")
	private String Email;
@NotNull
@Size(min=10,max=10)
	private String Contact;
@NotNull
	private String City;
@NotNull
@DateTimeFormat(pattern="dd-mm-yyyy")
	private String DateOfBirth;
@NotNull
@Pattern(regexp="^[a-zA-Z0-9]{10}", message="only 10 chars/digits")
//@Size(max=10,min=5)
	private String Password;
@NotNull
	private String Cource;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getRollNo() {
	return RollNo;
}
public void setRollNo(String rollNo) {
	RollNo = rollNo;
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
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getCource() {
	return Cource;
}
public void setCource(String cource) {
	Cource = cource;
}
@Override
public String toString() {
	return "Student [FirstName=" + FirstName + ", LastName=" + LastName + ", RollNo=" + RollNo + ", Email=" + Email
			+ ", Contact=" + Contact + ", City=" + City + ", DateOfBirth=" + DateOfBirth + ", Password=" + Password
			+ ", Cource=" + Cource + "]";
}
	
	
}
