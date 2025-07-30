package com.cts.productapp.service;

import java.util.List;

import com.cts.productapp.model.Employee;

public interface EmployeeService {
	String addEmployee(Employee employee);

	String updateEmployee(Employee employee);

	String deleteEmployeeById(int employeeId);

	Employee getEmployeeById(int employeeId);

	List<Employee> getAllEmployee();

	List<Employee> getEmployeeByDesg(String employeeDesg);

	List<Employee> getEmployeeBetweenSalRange(int intialPrice, int finalPrice);
	List<Employee> getAllEmployeesAboveSal(int intialPrice);
	String getAllEmployeesBelowSal(int intialPrice);

}
