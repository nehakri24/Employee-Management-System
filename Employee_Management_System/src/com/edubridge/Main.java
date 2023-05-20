package com.edubridge;

import java.util.Scanner;

import com.edubridge.Dao.EmployeeDao;
import com.edubridge.pojo.Employee;

public class Main 
{

	public static void main(String[] args) {
	    EmployeeDao ems = new EmployeeDao();
	   // Employee e1=new Employee();
	    Scanner sc = new Scanner(System.in);
	    int choice = 0;
	    while (choice != 5) {
	      System.out.println("1. Add Employee");
	      System.out.println("2. Remove Employee");
	      System.out.println("3. Display Employees");
	      System.out.println("4. Update");
	      System.out.println("5. Exit");
	      System.out.print("Enter your choice: ");
	      choice = sc.nextInt();
	      sc.nextLine();
	      switch (choice) {
	        case 1:
	          System.out.print("Enter Employee ID: ");
	           int id=sc.nextInt();
	          sc.nextLine();
	          System.out.print("Enter Employee Name: ");
	          String name = sc.nextLine();
	          System.out.print("Enter Employee Age: ");
	          int age = sc.nextInt();
	          sc.nextLine();
	          System.out.print("Enter Employee Salary: ");
	          double salary = sc.nextDouble();
	          sc.nextLine();
	          Employee e = new Employee(id, name, age, salary);
//	          /addEmployee(Employee e)
	          ems.addEmployee(e);
	          System.out.println("Employee added successfully!");
	          break;
	          case 2:
	          System.out.print("Enter Employee ID to remove: ");
	          int removeId = sc.nextInt();
	          sc.nextLine();
	          ems.removeEmployee(removeId);
	          System.out.println("Employee removed successfully!");
	          break;
	          case 3:
	          System.out.println("List of Employees:");
	          ems.displayEmployees();
	          break;
	          case 4:
	        	  
		          ems.updateEmployee();
		          break;
	          case 5:
	          System.out.println("Exiting Employee Management System...");
	          break;
	          default:
	          System.out.println("Invalid choice. Try again.");
	          break;
	          }
	          }
	          sc.close();
	          }
	          }
