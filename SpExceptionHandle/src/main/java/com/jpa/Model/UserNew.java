package com.jpa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class UserNew {
public UserNew() {	}


public UserNew(String first_name, String last_name, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}


@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

@Column(name="first_name")
private String first_name;

@Column(name="last_name")
private String last_name;


@Column(name="email")
private String email;


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getFirst_name() {
	return first_name;
}


public void setFirst_name(String first_name) {
	this.first_name = first_name;
}


public String getLast_name() {
	return last_name;
}


public void setLast_name(String last_name) {
	this.last_name = last_name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


}
