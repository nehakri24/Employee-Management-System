package com.edubridge.Dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.edubridge.exception.EmployeeIDNotFoundException;
import com.edubridge.pojo.Employee;

public class EmployeeDao {
	 ArrayList<Employee> employees = new ArrayList<Employee>();

	 //Insert data 
	  public void addEmployee(Employee e) {
	    employees.add(e);
	  }
	  
	    public void updateEmployee() throws EmployeeIDNotFoundException             
	{
	    	Scanner sc=new Scanner(System.in);
		int flag=0;  //status variable
		
		System.out.println("Enter the employee ID to be updated: ");
		
		int empID=sc.nextInt();   //OLD employee ID
		
		for(int i=0;i<employees.size();i++)
		{
			 if(empID==(employees.get(i).getId()))
			 {
				// System.out.println("Enter  employee Id: ");
					//int updatedEmployee=sc.nextInt();  
					//NEW Id
					System.out.println("Enter the updated employee Name: ");
					String updatedEmpname=sc.next(); 
					employees.get(i).setName(updatedEmpname);
				 System.out.println("employee name updated");
				 flag=1;
				 break;
			 }
		}
		if(flag==0)
		{
			try
			{
			throw new EmployeeIDNotFoundException("Employee ID does not exist");
			}
			catch(EmployeeIDNotFoundException ne)
			{
				System.out.println("Please try again!");
			}
		}
	}
	   

	  public void removeEmployee(int id) {
	    for (int i = 0; i < employees.size(); i++) {
	      Employee e = employees.get(i);
	      if (e.getId() == id) {
	        employees.remove(i);
	        break;
	      }
	    }
	  }

	  public void displayEmployees() {
	    for (Employee e : employees) {
	      System.out.println(e);
	    }
	  }
	}


