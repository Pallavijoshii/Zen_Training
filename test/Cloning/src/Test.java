class Product implements Cloneable
{
	private int id;
	private String name;
	private double cost;
	
public Product()
{
	
}
public Product(int id,String name,double cost)
{
	super();
	this.id=id;
	this.name=name;
	this.cost=cost;
	
}
public String toString()
{
	return "Product[id=" +id+ ",name="+name+ ",cost="+cost+"]";
	}
public Object clone() throws CloneNotSupportedException
{
	return super.clone();
	}
public double getCost()
{
	return cost;
	}
public void setCost(double cost)
{
	this.cost=cost;
	}
}

//generate equals and hashcode using IDE




public class Test {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Product p1=new Product(12,"cellphone",20000);
		Product p2=(Product)p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		p1.setCost(30000);
		System.out.println(p1);
		System.out.println(p2);
	}

	}


