package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long>{

}
