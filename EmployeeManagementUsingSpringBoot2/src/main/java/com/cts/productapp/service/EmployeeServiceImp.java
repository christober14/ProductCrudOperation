package com.cts.productapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.productapp.model.Employee;
import com.cts.productapp.repository.EmployeeRepository;

@Service("service")
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	EmployeeRepository repo;

	public EmployeeServiceImp() {
		super();
	}

	@Override
	public String addEmployee(Employee employee) {
		repo.save(employee);
		return "Employee added successfully";
	}

	@Override
	public String updateEmployee(Employee employee) {

		repo.save(employee);
		return "Employee updated successfully";
	}

	@Override
	public String deleteEmployeeById(int employeeId) {
		repo.deleteById(employeeId);
		return "employee removed successfully";
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Optional<Employee> pd = repo.findById(employeeId);
		return pd.get();
	}

	@Override
	public List<Employee> getAllEmployee() {

		return repo.findAll();
	}

	@Override
	public List<Employee> getEmployeeByDesg(String employeeDesg) {

		return repo.findByEmployeeDesg(employeeDesg);
	}

	@Override
	public List<Employee> getEmployeeBetweenSalRange(int intialPrice, int finalPrice) {

		return repo.findByEmployeeSalBetween(intialPrice, finalPrice);
	}
	
	@Override
	public List<Employee> getAllEmployeesAboveSal(int intialPrice) {

		return repo.findByEmployeeSalGreaterThan(intialPrice);
	}
	
	@Override
	public String getAllEmployeesBelowSal(int intialPrice) {
		int result=repo.findByEmployeeWithSalLessThan(intialPrice);
		return "Employee Updated Successfully :"+result  ;
	}

}
