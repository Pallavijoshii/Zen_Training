package mypac;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=6-i;j++)
				System.out.print(j);
			for(j=1;j<=(2*(i-1))-1;j++)
				System.out.print(" ");
			for(j=6-i;j>=1;j--)
				System.out.print(j);
			System.out.println();
			
		}

	}

}
