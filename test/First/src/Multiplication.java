
import java.util.Scanner;

public class Multiplication{
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]mat1=new int[3][3];
		int [][]mat2=new int[3][3];
		int i, j;
		System.out.println("Enter elements of matrix 1:");
		for(i=0;i<mat1.length;i++)
		{
			for(j=0;j<mat1[i].length;j++)
			{
			    mat1[i][j]=sc.nextInt();
			}
		}
 
		System.out.println("Enter elements of matrix 2:");
		for(i=0;i<mat2.length;i++)
		{
			for(j=0;j<mat2[i].length;j++)
			{
			    mat2[i][j]=sc.nextInt();
			}
		}
		int [][]product= new int[3][3];
		for(i=0;i<mat1.length;i++)
		{
			for(j=0;j<mat2.length;j++)
			{
				for(int k=0;k<mat1.length;k++)
			    product[i][j]+=mat1[i][k]* mat2[k][j];
				System.out.print(product[i][j]+ " ");
			}
			System.out.println();
		}
 
 
	}
 
}