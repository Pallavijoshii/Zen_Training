package mypac;

import java.util.Scanner;

public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int[][]a= {{1,2,3},{4,5,6,7},{8,9}};
		int [][]b=new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][]c;
		c=new int[3][];
		c[0]=new int[4];
		c[1]=new int[3];
		c[2]=new int[2];
		System.out.println("enter array elements");
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
	/*	for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}*/
		for(int []x:c)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
	}
}