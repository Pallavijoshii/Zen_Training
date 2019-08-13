import java.util.*;

public class Test2 {

	public static void main(String[] args) {
	
       Vector<Integer> v=new Vector<>();
       v.add(12);
       v.add(123);
       v.add(10);
       v.add(10);
	   v.add(29);
	   v.add(65);
	   System.out.println(v);  //using toString

	for(Integer x:v)
		
		System.out.print(x+" ");  //using for-each
		System.out.println();
		
		
	Iterator<Integer> it=v.iterator();
	//it.next();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	while(it.hasNext())
	{
		System.out.print(it.next()+" "); //using iterator
	}
		}

}
