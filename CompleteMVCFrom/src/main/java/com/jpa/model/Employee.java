package com.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

@Column(name="First_Name")
private String First_Name;

@Column(name="Last_Name")
private String Last_Name;

@Column(name="Email")
private String Email;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirst_Name() {
	return First_Name;
}

public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}

public String getLast_Name() {
	return Last_Name;
}

public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}


}
