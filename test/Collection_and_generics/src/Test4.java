
import java.util.*;

class Studen
{
	private int rollno;
	private String name;
	private double per;
public double getPer()
{
	
return per;
}

public void setPer(double per)
{
	this.per=per;
}

public Studen(int rollno,String name,double per)
{
	super();
	this.rollno=rollno;
	this.name=name;
	this.per=per;
	
}

public String toString()
{
return "Student[rollno=" +rollno+ ",name=" +name+ ",per="+per+ "]"	;

}
}


class StudenCompare implements Comparator<Studen>{
	public int compare(Studen o1,Studen o2)
	{
		if(o1.getPer()>o2.getPer())
		{
			return -1;
		}
		else if(o1.getPer()<o2.getPer())
		{
			return 1;
		}
		else 
			return 0;
	}
}

public class Test4 {

	public static void main(String[] args)
	{
		List<Studen> list=new ArrayList<>();
		list.add(new Studen(1,"abc",60));
		list.add(new Studen(2,"pqr",47));
		list.add(new Studen(3,"xyz",50));
		
		Collections.sort(list,new StudenCompare());
		for(Studen s:list)
		{
			System.out.println(s);
		}
	}
}
