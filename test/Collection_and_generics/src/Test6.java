//Exception handling

import java.util.*;
class A
{
	public void fun()
	{
		
	}}


public class Test6 {
	public static void foo() throws InterruptedException
	{
		foo1();
	}
	public static void foo1() throws InterruptedException
	{
		Thread.sleep(100);
	}
	
	
	
	public static void main(String[]args)
	{
		try {
			foo();
			System.out.println("test");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception");
		}
	}

}
