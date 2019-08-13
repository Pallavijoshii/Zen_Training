import java.util.*;

class Student
{
	private int rollno;
	private String name;
	private double per;
	
	
	
public Student(int rollno,String name,double per)
{
	super();
	this.rollno=rollno;
	this.name=name;
	this.per=per;
	
}

public String toString()
{
return "Student[rollno=" +rollno+ ",name=" +name+ ",per="+per+ "]"	;

}//hashcode and equals

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(per);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + rollno;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(per) != Double.doubleToLongBits(other.per))
		return false;
	if (rollno != other.rollno)
		return false;
	return true;
}



}
/*public class Test3 {
public static void main(String []args)
{
Set<Student>s=new HashSet<>();
s.add(new Student(1,"abc",59));
s.add(new Student(2,"pqr",67));
s.add(new Student(3,"xyz",56));
s.add(new Student(3,"xyz",56));
for(Student x:s)
{
System.out.println(x);	
}

}
}*/



/*public class Test3 {
public static void main(String []args)
{
Map<Integer,String>m=new TreeMap<>();
m.put(1,"jack");
m.put(77,"jill");
m.put(876,"hari");
m.put(560,"ram");
System.out.println(m);	

Set<Map.Entry<Integer,String >>s=m.entrySet();
for(Map.Entry<Integer,String>i:s)
{
	System.out.println(i.getKey()+" "+i.getValue());
	
}
System.out.println();

Set<Integer> ks=m.keySet();
for(Integer x:ks)
{
System.out.println(x+" "+m.get(x));	
}
}
}*/





public class Test3 {
public static void main(String []args)
{
	List<Student> list=new ArrayList<>();
	list.add(new Student(1,"abc",60));
	list.add(new Student(2,"pqr",47));
	list.add(new Student(3,"xyz",50));
	list.add(new Student(4,"lmn",36));
}
}
