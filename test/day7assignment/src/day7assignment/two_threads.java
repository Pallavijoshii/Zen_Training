package day7assignment;

import java.util.Scanner;


class MyThread implements Runnable
{
	private Thread t1,t2;
	private int num=0;
	public MyThread(int n)
	{
		this.num=n;
		t1=new Thread(this,"inc");
        t2=new Thread(this,"mul");
		t1.start();
		t2.start();
		
		
	}
	
	public synchronized void run() {
		int i;
		
		{
		for(i=1;i<11;i++)
		{
			
			if(Thread.currentThread()==t1)
			{  	
				System.out.println(num++);
			}
			else if(Thread.currentThread()==t2)
			{
				       
				 int temp=num*i;
				System.out.println(temp);
			}
		}
		}
	}
	
}


public class two_threads {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		new MyThread(num);
		
		}
	}
