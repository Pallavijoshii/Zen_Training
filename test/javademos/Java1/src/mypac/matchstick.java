package mypac;

import java.util.Scanner;

public class matchstick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=0,a=0;
while(n!=20)
{
	System.out.println("enter a number between 1-4");
	a=sc.nextInt();
	System.out.println("computer choose:"+(5-a));
	n=n+5;
	System.out.println("total:"+n);
	if(n==20)
	System.out.println("you loose!");
}
	}

}
