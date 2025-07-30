package com.cts.productapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeManagementUsingSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeManagementUsingSpringBootApplication.class, args);
//		EmployeeService service = context.getBean(EmployeeService.class, "service");
//		System.out.println(service);
//		String employeeName;
//		int employeeId;
//		int employeeSal;
//		String employeeDesg;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("*******Employee Management*******");
//		while (true) {
//			System.out.println("" + "1.Add Employee\r\n" + "2.Update Employee\r\n" + "3.Delete Employee By Id\r\n"
//					+ "4.Get Employee By Id\r\n" + "5.Get All Employee\r\n" + "6.Get Employee By Designation\r\n"
//					+ "7.Get Employee Between Salary Range\r\n" + "");
//			int option = scanner.nextInt();
//
//			switch (option) {
//			case 1:
//				System.out.println("Add Employee");
//				System.out.println("Enter Employee Name :");
//				employeeName = scanner.next();
//				System.out.println("Enter Employee Salary :");
//				employeeSal = scanner.nextInt();
//				System.out.println("Enter Employee Designation :");
//				employeeDesg = scanner.next();
//				Employee employee = new Employee(employeeName, employeeSal, employeeDesg);
//				System.out.println(service.addEmployee(employee));
//				break;
//			case 2:
//				System.out.println("Update Employee");
//				System.out.println("Enter Exsisitng Employee Id :");
//				employeeId = scanner.nextInt();
//				System.out.println("Enter Employee Name :");
//				employeeName = scanner.next();
//				System.out.println("Enter Employee Salary :");
//				employeeSal = scanner.nextInt();
//				System.out.println("Enter Employee Designation :");
//				employeeDesg = scanner.next();
//				employee = new Employee(employeeName, employeeSal, employeeDesg);
//				employee.setEmployeeId(employeeId);
//				System.out.println(service.updateEmployee(employee));
//				break;
//			case 3:
//				System.out.println("Enter Employee Id To Delete :");
//				employeeId = scanner.nextInt();
//				System.out.println(service.deleteEmployeeById(employeeId));
//				break;
//			case 4:
//				System.out.println("Enter Employee Id To Get:");
//				employeeId = scanner.nextInt();
//				Employee pd = service.getEmployeeById(employeeId);
//				System.out.println("Employee :" + pd.getEmployeeName());
//				break;
//			case 5:
//				List<Employee> pdl = service.getAllEmployee();
//				for (Employee pds : pdl) {
//					System.out.println("Employee id: " + pds.getEmployeeId() + " " + "Employee Name: "
//							+ pds.getEmployeeName() + " " + "Employee Salary: " + pds.getEmployeeSal() + " "
//							+ "Employee Designation: " + pds.getEmployeeDesg());
//				}
//				break;
//			case 6:
//				System.out.println("Enter Employee Designation :");
//				employeeDesg = scanner.next();
//				List<Employee> prds = service.getEmployeeByDesg(employeeDesg);
//				for (Employee pds : prds) {
//					System.out.println("Employee id: " + pds.getEmployeeId() + " " + "Employee Name: "
//							+ pds.getEmployeeName() + " " + "Employee Salary: " + pds.getEmployeeSal() + " "
//							+ "Employee Designation: " + pds.getEmployeeDesg());
//				}
//				break;
//			case 7:
//				System.out.println("Enter Initial Salary Range:");
//				int initalPrice = scanner.nextInt();
//				System.out.println("Enter final Salary Range :");
//				int finalPrice = scanner.nextInt();
//				List<Employee> prdl = service.getEmployeeBetweenSalRange(initalPrice, finalPrice);
//				for (Employee pds : prdl) {
//					System.out.println("Employee id: " + pds.getEmployeeId() + " " + "Employee Name: "
//							+ pds.getEmployeeName() + " " + "Employee Salary: " + pds.getEmployeeSal() + " "
//							+ "Employee Designation: " + pds.getEmployeeDesg());
//				}
//				break;
//			default:
//				System.out.println("Enter the valid option");
//				break;
//			}
//		}
	}

}
