import java.util.*;
class MyException extends Exception
{
	String msg;
	public MyException(String s)

{
	msg=s;
	
}
public String toString()
{
	return msg;
}
}

public class Test7 {
	public static double divide(int num,int den) throws MyException
	{
		if(den==0)
			throw new MyException("denominator is zero");
		return (double)num/den;
	}
	
	public static void main(String []args)
	{
		try
		{
			System.out.println(divide(12,0));
		}
		catch(MyException me)
		{
			System.out.println(me);
		}
	}

}
