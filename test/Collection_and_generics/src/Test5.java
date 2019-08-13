import java.util.*;
class Studentt implements Comparable<Studentt>
{
	private int rollno;
	private String name ;
	private double per;
 
 
	public Studentt(int rollno , String name, double per) 
	{
		super();
		this.rollno=rollno;
		this.name=name;
		this.per=per;
 
	}
 
 
	public double getPer() {
		return per;
	}
 
 
	public void setPer(double per) {
		this.per = per;
	}
 
 
	public String toString()
	{
		return "Student[rollno= "+rollno+", name= "+name+" ,percentage= "+per+" ]"; 
	}
 
	public int compareTo(Studentt o)
	{
		if(per>o.per)
			return 1;
		else if (per<o.per)
			return -1;
		else 
			return 0;
	}
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
		Studentt other = (Studentt) obj;
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
 
 
class StudenttCompare implements Comparator<Studentt>
{
	public int compare(Studentt o1, Studentt o2)
	{
		if (o1.getPer()>o2.getPer() )
		{
			return 1;
 
		}
 
		else if(o1.getPer()<o2.getPer())
		{
			return -1;
		}
		else
			return 0;
	}
}
public class Test5
{
 
	public static void main(String[] args) {
		/*Set<Student> s = new HashSet<>();
		s.add(new Student(1,"abc",59));
		s.add(new Student(2,"perr",65));
		s.add(new Student(3,"eiu",89));
		s.add(new Student(4,"gtuy",77));
		s.add(new Student(5,"gfew",98));
 
		for(Student x: s)
		{
			System.out.println(x);
		}
 
 
 
		Map <Integer,String> m= new HashMap<>();
		m.put(1,"tis");
		m.put(875,"td");
		m.put(88,"tffs");
		m.put(8,"tsfs");
 
		System.out.println(m);
		Set<Map.Entry<Integer,String>> s1= m.entrySet();
 
		for(Map.Entry<Integer,String> i :s1 )
		{
			System.out.println(i.getKey()+ " "+ i.getValue());
		}
 
		Set<Integer> ks= m.keySet();
		for(Integer x:ks)
		{
			System.out.println(x + " "+ m.get(x));
		}*/
 
 
		List <Studentt> list = new ArrayList<>();
		list.add(new Studentt(1,"if",87));
		list.add(new Studentt(23,"dfgif",47));
		list.add(new Studentt(13,"kjfdg",54));
		list.add(new Studentt(124,"grtu",83));
		list.add(new Studentt(33,"djgh",92));
 
		//Collections.sort(list, new StudentCompare() );
		Collections.sort(list);
 
 
		for(Studentt s:list)
		{
			System.out.println(s);
		}
	}
 
}