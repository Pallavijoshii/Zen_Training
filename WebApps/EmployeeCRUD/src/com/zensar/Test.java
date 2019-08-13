package com.zensar;

import java.util.List;

public class Test {
	public static void main(String[] args) throws Exception
	{
		EmployeeDAO dao=new EmployeeDAO();	
		Employee employee=new Employee(1002,"jill",9000);
	   int result= dao.addEmployee(employee);
	 // int result=dao.getAllEmployees()
		if(result>0)
	   {
		   System.out.println("Success");
	   }
	   else
	   {
		   System.out.println("Failed");
	  }
	List<Employee> listOfAllEmployees=dao.getAllEmployees();
	for(Employee employee1:listOfAllEmployees)
	{
		System.out.println(employee1.getEmpid());
		System.out.println(employee1.getEmpname());
		System.out.println(employee1.getSalary());
	
}
}
}
	


