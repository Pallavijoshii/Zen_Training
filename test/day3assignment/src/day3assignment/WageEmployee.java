package day3assignment;


public class WageEmployee extends Employee
{
	private int hours;
	private int rate;
	private int salary;
	
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public WageEmployee() {
		hours=0;
		rate=0;
	}
	public WageEmployee(int empid, String name, int d, int m, int y,int hours, int rate) {
		super(empid,name,d,m,y);
		this.hours = hours;
		this.rate = rate;
	}
	public void display()
	{
		super.display();
		System.out.println("No. of hours worked"+hours);
		System.out.println("Rate per hour"+rate);
	}
	public void salaryWageEmp() 
	{
		salary=hours*rate;
		System.out.println("WageEmployee salary is"+salary);
	}
	
}
