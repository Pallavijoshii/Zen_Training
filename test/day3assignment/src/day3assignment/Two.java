package day3assignment;

import java.util.Scanner;

class AccountHolder
{
	private int account_number=0; 
	private String account_holder_name=" ";
	private double account_balance=0;
	private static int count;
	
	static 
	{
		count=101;
	}
	public AccountHolder() {
		account_number = count++;
		
	}
	public AccountHolder(String account_holder_name, double account_balance) {
		account_number = count++;
		this.account_holder_name = account_holder_name;
		this.account_balance = account_balance;
	}
	
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public void display()
	{
		System.out.println(account_number+" "+account_holder_name+" "+account_balance);
	}
}
public class Two 
{
  public static void main(String args[])
  {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter User 1 name and balance:-");
	String strName= scanner.next();
	double temp=scanner.nextDouble();
	AccountHolder accountHolder=new AccountHolder();
	System.out.println("Enter User 2 name and balance:-");
	String strName1= scanner.next();
	double temp1=scanner.nextDouble();
	
	
	AccountHolder accountHolder1=new AccountHolder();
	accountHolder.setAccount_holder_name(strName1);
	accountHolder.setAccount_balance(temp1);
	accountHolder1.setAccount_holder_name(strName);
	accountHolder1.setAccount_balance(temp);
	System.out.println("User details are:-");
	accountHolder.display();
	accountHolder1.display();
	
  }
}