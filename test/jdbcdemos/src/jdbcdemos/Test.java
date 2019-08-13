package jdbcdemos;

import java.sql.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		try {

		Class.forName("com.mysql.jdbc.Driver");       //loading class
		System.out.println("driver loaded...");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_mysql","root","Temp1234");   //get connection
        System.out.println("connected to database..");
        
        Scanner sc=new Scanner(System.in);
        int id;
        String n;
        double sal;
        System.out.println("enter employee info");
        id=sc.nextInt();
        n=sc.next();
        sal=sc.nextDouble();
        
        Statement stmt=conn.createStatement();       //create statement
        
       /* ResultSet rs=stmt.executeQuery("select * from Employee");  //execute query and process resultset
        while(rs.next())
        {
        System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
        
        }*/
        
       // stmt.executeUpdate("insert into Employee values(4,'raj',76890)"); 
       
        PreparedStatement psstmt=conn.prepareStatement("insert into Employee values(?,?,?)");
        psstmt.setInt(1, id);
        psstmt.setString(2, n);
        psstmt.setDouble(3, sal);
        
        psstmt.executeUpdate();
        conn.close();                                           //close connection
		}catch(Exception e) {
			e.printStackTrace();
		}
	

}
	}
