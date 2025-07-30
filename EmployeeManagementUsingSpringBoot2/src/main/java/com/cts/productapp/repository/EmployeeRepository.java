package com.cts.productapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cts.productapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

	List<Employee> findByEmployeeDesg(String employeeDesg);

	List<Employee> findByEmployeeSalBetween(int intialPrice, int finalPrice);
	List<Employee> findByEmployeeSalGreaterThan(int intialPrice);
	@Modifying
	@Transactional
	@Query("UPDATE Employee e SET e.employeeSal = e.employeeSal + ?1 WHERE e.employeeSal < 20000")
	int findByEmployeeWithSalLessThan(int intialPrice);

}
