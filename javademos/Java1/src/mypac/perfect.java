package mypac;

import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.println("it is a perfect no.");
		else
			System.out.println("it is not a perfect no.");
	}
   int divisor(int x)
   {
	   return x;
   }
}
