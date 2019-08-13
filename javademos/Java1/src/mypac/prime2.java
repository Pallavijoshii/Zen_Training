package mypac;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
	
		System.out.println("first 100 prime no.");
		for(int i=2;i<=101;i++)
		{
			for(int j=2;j<i;j++)
		{
			if(i%j==0)
				break;
			else
				count++;
		}
		if(count==i-2)
			System.out.println(i+ " ");
		count=0;

	}
	}
}
