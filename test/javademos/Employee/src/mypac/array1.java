package mypac;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int i,smallest=0,largest=0;
		int []c;
		c=new int[5];
		System.out.println("enter array elements");
		for(i=0;i<c.length;i++)
			{
			c[i]=sc.nextInt();
			}
		
		largest=c[0]; 
		smallest=c[0];
		
		for(i=0;i<c.length;i++)
		{
			
			if(largest<c[i])
				largest=c[i];
			else
				smallest=c[i];
			
		}
		System.out.println("largest element=" +largest+"smallest element="+smallest);
		
		
		int []b=new int[5];
		for(i=0;i<=b.length-1;i++)
		{
		b[i]=c[i]*5;
		}
		for(int x:b)
		{System.out.println(x+"  ");
		}
	
	}

}