//Collection and generics


public class Test<G> {
	
	public void Swap(G a,G b)
	{
		G temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println(a+"\t"+b);
	}
	public static void main(String[] args)
	{
		Test<Integer> t1=new Test<>();
		t1.Swap(10, 20);
		
		Test<String> t2=new Test<>();
		t2.Swap("First","Second");
	}

}
