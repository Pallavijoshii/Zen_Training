package mypac;

 class Employee
{
	private int empid;
	private String name;
	private double salary;
	private static int cnt;
	
static
{
	cnt=0;
}

public Employee()
{
	cnt++;
}

public Employee(int empid,String name,double salary)
{
	this.empid=empid;
	this.name=name;
	this.salary=salary;
	cnt++;
}

public void display()
{
	System.out.println(empid+"\t"+name+"\t"+salary);
}
public static void showCnt()
{
	System.out.println("no. of objects-" +cnt);
}
}


public class test {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee(1,"ram",12345);
		Employee e3=new Employee();
		Employee e4=new Employee(4,"shyam",76543);
		Employee.showCnt();
	}

}
