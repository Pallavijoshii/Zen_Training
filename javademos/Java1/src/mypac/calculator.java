package mypac;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		char operator;
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("choose operator for the operations to be performed over two numbers");
		operator=sc.next().charAt(0);
		
		switch(operator)
		{
		case '+':
		 System.out.println("result="+(a+b));
			break;
		case '-':
		 System.out.println("result="+(a-b));
		break;
		case '*':
			System.out.println("result="+(a*b));
			break;
		case '/':
			System.out.println("result="+(a/b));
			break;
		default:
			System.out.println("invalid input");
		}
				

	}

}
