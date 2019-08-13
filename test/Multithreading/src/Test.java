import java.util.Scanner;

//multithreading

/*class MyThread1 extends Thread
{
   public void run()	
   {
	   int i;
	   for(i=0;i<100;i++)
	   {
		   System.out.println("hello...");
	   }
   }
}

class MyThread2 extends Thread
{
   public void run()	
   {
	   int i;
	   for(i=0;i<100;i++)
	   {
		   System.out.println("hi...");
	   }
   }
}
public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.setName("hello");
		t2.setName("hi");
		System.out.println("name of t1 is"+t1.getName());
        System.out.println("name of t1 is"+t1.getName());
	}

}*/






class MyThread implements Runnable
{
	private Thread t1,t2;
	private String name;
	public MyThread(String name)
	{
		String n = null;
		name=n;
		t1=new Thread(this,"hello_thread");
        t2=new Thread(this,"hello_thread");
		t1.start();
		t2.start();
		
	}
	
	public void run() {
		int i;
		for(i=0;i<100;i++)
		{
			if(Thread.currentThread()==t1)
			{
				System.out.println("hello..."+name);
			}
			else if(Thread.currentThread()==t2)
			{
				System.out.println("hi...");
			}
		}
	}
	
}


public class Test {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("enter name");
		name=sc.next();
		new MyThread(name);
		}
	}
