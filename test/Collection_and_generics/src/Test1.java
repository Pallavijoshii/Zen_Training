/*class Stack
{
	private int []arr;
	private int top, size;
 
 
	public Stack() 
	{
		size=5;
		arr=new int[size];
		top=-1;
	}
	public void push(int data)
	{
		if(!isfull())
		    arr[++top]=data;
		else 
			System.out.println("Overflow!!!");
	}
 
	public int pop()
	{
		if(!isempty())
			return arr[top--];
		else
		{
			System.out.println("underflow!!!");
			return -1;
		}
	}
	public boolean isfull()
	{
		return top==size-1;
	}
	public boolean isempty()
	{
		return top==-1;
	}
 
 
}
public class Test1
 
{
 
 
	public static void main(String[] args) 
 
	{
		Stack s=new Stack();
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
 
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
 
 
	}
 
}*/









class Stack<G>
{
	private G []arr;
	private int top, size;
 
 
	public Stack() 
	{
		size=5;
		arr=(G[])new Object[size];
		top=-1;
	}
	public void push(G data)
	{
		if(!isfull())
		    arr[++top]=data;
		else 
			System.out.println("Overflow!!!");
	}
 
	public G pop()
	{
		if(!isempty())
			return arr[top--];
		else
		{
			System.out.println("underflow!!!");
			return null;
		}
	}
	public boolean isfull()
	{
		return top==size-1;
	}
	public boolean isempty()
	{
		return top==-1;
	}
 
 
}
public class Test1
 
{
 
 
	public static void main(String[] args) 
 
	{
		Stack<Integer> s=new Stack<>();
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
 
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		Stack<String> s2=new Stack<>();
		s2.push("first");
		s2.push("second");
		s2.push("third");
		s2.push("fourth");
		s2.push("fifth");
 
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
	}
 
}
 
 