package mypac;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int i;
int []a={1,2,3,4,5};
int []b=new int[] {1,2,3,4,5};

int []c;
c=new int[5];
System.out.println("enter array elements");
for(i=0;i<c.length;i++)
	{
	c[i]=sc.nextInt();
	}
for(int x:c)
	{System.out.println(x+"  ");
	}
}

}
