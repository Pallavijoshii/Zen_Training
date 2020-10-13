package mypac;
import java.util.Scanner;                                                             


class Employee
{
	private int empid;
	private String name;
	private double salary;
	
	public Employee()
	{
		empid=1;
		name="abc";
		salary=50000;
	}
	
public Employee(int id,String n,double s)
{
	empid=id;
	name=n;
	salary=s;
}
public void accept()
{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter id ,name and salary");
	empid=sc.nextInt();
	name=sc.next();
	salary=sc.nextDouble();
}
	                 
public void display()
{
	System.out.println(empid+"\t"+name+"\t"+salary);
	}
public String toString()
{
	return empid+" "+name+" "+salary;
	}
public String getName()
{
	return name;
	}
public void setName(String n)
{
	name=n;
	}

}

public class test {

	public static void main(String[] args) {
		 Employee e1;
		 e1=new Employee();
		 Employee e2=new Employee(2,"Jack",20000);
		 
		 String n=e2.getName();
		 System.out.println(n);
		 
		 e2.setName("Rahul");
		 System.out.println(e2);

	}

}