package mypac;

import java.util.Scanner;

public class perfect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,start,end,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		start=sc.nextInt();
		System.out.println("enter second number");
		end=sc.nextInt();
		
		
		for(i=start;i<=end;i++)
		{
			if(isPerfect(i))
			{
				System.out.println(" "+i);
			}
		}
	}

public static boolean isPerfect(int n)
{
	int sum=0;
	for(int i=1;i<=n/2;++i)
		{
		if(n%i==0)
		{
			sum=sum+i;
			
		}
		}
	if(sum==n)
		return true;
	else
		return false;
	}
}