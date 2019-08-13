
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		int [][]matrix;
		matrix=new int[3][3];
		System.out.println("enter array elements");
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
	
		for(int []x:matrix)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		int column=3,row=3;
		int [][]transpose=new int[column][row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				transpose[j][i]=matrix[i][j];
			}
		}
		System.out.println();
		for(int []y:transpose)
		{
			for(int z:y)
			{
				System.out.print(z+ " ");
			}
			System.out.println();
		}
		
		//2
		
		int [][]matrix1=new int[3][3];
		System.out.println("enter array elements");
		for( int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1[i].length;j++)
			{
				matrix1[i][j]=sc.nextInt();	
			}
			
			for(i=0;i<matrix1.length;i++)
			{
				for(int j=0;j<matrix1.length;j++)
				{
					System.out.print(matrix[i][j]+matrix1[i][j] +" ");
				}
				System.out.println();
			}
		
		}
	}
}
		
	


