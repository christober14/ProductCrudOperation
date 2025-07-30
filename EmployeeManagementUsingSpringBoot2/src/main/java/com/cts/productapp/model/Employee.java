package com.cts.productapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //table -- important 
@Table(name="employee") //to specific name
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	
	@Id //primary key
	@Column(length=3, nullable = false) //specific column name and related data's
	@GeneratedValue //auto generated
	private int employeeId;
	
	private int employeeSal;
	
	private String employeeName;
	private String employeeDesg;
	
	
	
//	public Employee() {
//		System.out.println("Default construct");
//	}
//
//	public Employee(String employeeName, int employeeSal, String employeeDesg) {
//		super();
//		this.employeeSal = employeeSal;
//		this.employeeName = employeeName;
//		this.employeeDesg = employeeDesg;
//	}
//
//
//	public int getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public int getEmployeeSal() {
//		return employeeSal;
//	}
//
//	public void setEmployeeSal(int employeeSal) {
//		this.employeeSal = employeeSal;
//	}
//
//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//
//
//	public String getEmployeeDesg() {
//		return employeeDesg;
//	}
//
//	public void setEmployeeDesg(String employeeDesg) {
//		this.employeeDesg = employeeDesg;
//	}
//
//	public void setProductSal(String productCategotry) {
//		this.employeeDesg = productCategotry;
//	}

}
