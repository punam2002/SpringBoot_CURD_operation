package com.jpa.Service;

import java.util.List;

import com.jpa.model.Employee;

public interface EmployeeService {
List <Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeById(long id);
void deleteEmployeeById(long id);
}
