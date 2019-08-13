package mypac;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b,c ");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("largest no is "+a);
		
		if(b>a && b>c)
		System.out.println("largest no is "+b);
		
		if(c>a && c>b)
		System.out.println("largest no is "+c);
		
	}

}
