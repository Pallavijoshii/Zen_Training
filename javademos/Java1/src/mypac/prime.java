package mypac;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i,p=0;
		System.out.println("enter a number");
		num=sc.nextInt();
		System.out.println("enter a number");
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
				p++;
		}
		if(p==2)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
			
	}

}