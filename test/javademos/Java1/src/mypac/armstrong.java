package mypac;

import java.util.Scanner;

public class armstrong {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
	    int num,r,sum=0,temp;
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		if(sum==temp)
			System.out.println("it is an armstrong no.");
		else
			System.out.println("it is not an armstrong no");
		
	}
}