package com.cts.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.productapp.model.Employee;
import com.cts.productapp.service.EmployeeService;

@RestController
@RequestMapping("/employee") // http://localhost:9090/employee
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("/save") // http://localhost:9090/employee/save
	public String saveEmployee(@RequestBody Employee Employee) {
		return service.addEmployee(Employee);
	}

	@PutMapping("/update") // http://localhost:9090/employee/update
	public String editEmployee(@RequestBody Employee Employee) {
		return service.updateEmployee(Employee);
	}

	@DeleteMapping("/delete/{eid}") // http://localhost:9090/employee/delete/123
	public String deleteEmployee(@PathVariable("eid") int EmployeeId) {
		return service.deleteEmployeeById(EmployeeId);
	}

	@GetMapping("/fetch/{eid}") // http://localhost:9090/employee/fetch/123
	public Employee getEmployee(@PathVariable("eid") int EmployeeId) {
		return service.getEmployeeById(EmployeeId);
	}

	@GetMapping("/fetchAll") // http://localhost:9090/employee/fecthAll
	public List<Employee> getAllEmployees() {
		return service.getAllEmployee();
	}

	@GetMapping("/fetchAllBetween/{sal1}/{sal2}") // http://localhost:9090/employee/fecthAllBetween/12000/14000
	public List<Employee> getAllEmployeesBetween(@PathVariable("sal1") int intialPrice,
			@PathVariable("sal2") int finalPrice) {
		return service.getEmployeeBetweenSalRange(intialPrice, finalPrice);
	}

	@GetMapping("/fetchAllByDesg/{Desg}") // http://localhost:9090/employee/fetchAllByDesg/dev
	public List<Employee> getAllEmployeesByDesg(@PathVariable("Desg") String Desg) {
		return service.getEmployeeByDesg(Desg);
	}
	
	@GetMapping("/fetchAllAboveSal/{sal1}") // http://localhost:9090/employee/fetchAllAboveSal/20000
	public List<Employee> getAllEmployeesAboveSal(@PathVariable("sal1") int  price) {
		return service.getAllEmployeesAboveSal(price);
	}
	
	@PutMapping("/fetchAllBelowSal/{sal1}") // http://localhost:9090/employee/fetchAllBelowSal/20000
	public String getAllEmployeesBelowSal(@PathVariable("sal1") int  price) {
		return service.getAllEmployeesBelowSal(price);
	}

}
