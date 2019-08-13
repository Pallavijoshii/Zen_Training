package jdbcdemos;

import java.sql.*;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	
		try {

		Class.forName("com.mysql.jdbc.Driver");       //loading class
		System.out.println("driver loaded...");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_mysql","root","Temp1234");   //get connection
        System.out.println("connected to database..");
        
        int id;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter id for which you need salary");
        id=sc.nextInt();
        
        String procedure="{call getSalary(?,?)}";
        CallableStatement cstmt=conn.prepareCall(procedure);
        cstmt.setInt(1,id);
        cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
        cstmt.execute();
        System.out.println("salary is"+cstmt.getInt(2));
        
        
        conn.close();                                           //close connection
		}catch(Exception e) {
			e.printStackTrace();
		}
	

}
	}
