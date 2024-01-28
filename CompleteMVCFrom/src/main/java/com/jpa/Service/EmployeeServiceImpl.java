package com.jpa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.model.Employee;
import com.jpa.repo.EmpRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired 
private EmpRepo emprepo;


	@Override
	public List<Employee> getAllEmployees() {
		return  emprepo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
	this.emprepo.save(employee);
		
	}

	@Override
	public Employee getEmployeById(long id) {
		Optional<Employee> optional=emprepo.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new RuntimeException("Employee not Found for id : "+id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.emprepo.deleteById(id);
		
	}

}
