package com.zensar;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDAO {
	private static Connection conn;
	public Connection createConnection()
	{
	try {

		Class.forName("com.mysql.jdbc.Driver");       
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Temp1234");  
        //Statement stmt=conn.createStatement();
       // ResultSet rs=stmt.executeQuery("Select * from Employee");
        System.out.println("connected to database..");
                                               
		}catch(Exception e) {
			e.printStackTrace();
		}
	return conn;

}

public int addEmployee(Employee employee) throws Exception
{
	Connection conn=createConnection();
	String sql="insert into employee values(?,?,?)";
	PreparedStatement pst=conn.prepareStatement(sql);
	pst.setInt(1,employee.getEmpid());
	pst.setString(2, employee.getEmpname());
	pst.setInt(3, employee.getSalary());

	int result=pst.executeUpdate();
	//conn.close();
	 
	return result;
}

public List<Employee> getAllEmployees() throws Exception
{
	List<Employee> listOfAllEmployees=new ArrayList<Employee>();
	Connection conn=createConnection();
	String sql="Select * from Employee";
	PreparedStatement pst=conn.prepareStatement(sql);
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		int employeeId=rs.getInt("employeeId");
		String employeeName=rs.getString("employeeName");
		int salary=rs.getInt("salary");
		Employee employee=new Employee(employeeId,employeeName,salary);
		listOfAllEmployees.add(employee);
	}
	
	return listOfAllEmployees;}
}

