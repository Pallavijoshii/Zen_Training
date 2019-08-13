
import java.util.Scanner;
 
public class Reverse {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, i;
 
		System.out.println("Enter number of elements you want in your array:");
		n=sc.nextInt();
		int []arr= new int[n];
		System.out.println("Enter Array Elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=n;
		int b[]= new int[n];
		for(i=0;i<n;i++)
		{
			b[j-1]=arr[i];
			j--;
		}
 
		for(int x:b)
		{
			System.out.print(x+ " ");
		}
 
 
 
	}
 
}