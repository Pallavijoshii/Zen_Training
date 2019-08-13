interface Polygon
{
public  double calcArea();
public  double calcPeri();

}
class Triangle implements Polygon
{
	private int base,height,side1,side2,side3;
 
	public Triangle()
	{
		base=height=side1=side2=side3=1;
	}
 
	public Triangle(int base, int height, int side1, int side2, int side3) {
		super();
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
 
	public double calcArea()
	{
		return 0.5*base*height;
	}
	public double calcPeri()
	{
		return side1+side2+side3;
	}
 
}
 
 
 abstract class Rectangle implements Polygon
 
{
	private int len,brd;
	public Rectangle()
	{
		len=brd=1;
	}
 
	public Rectangle(int len, int brd) {
		super();
		this.len = len;
		this.brd = brd;
	}
 
	public double calcArea()
	{
		return len*brd;
	}
	public double calcPeri1()
	{
		return 2*(len+brd);
	}
 
 
}
 
 
class Square extends Rectangle
 
{
	public Square()
	{
		super();
	}
	public Square(int s) 
	{
		super(s,s);
	}
	public double calcArea()
	{
		return super.calcArea();
	}
	public double calcperi1()
	{
		return super.calcPeri1();
	}
	@Override
	public double calcPeri() {
		// TODO Auto-generated method stub
		return 0;
	}
}
 
 
public class Test {
 
	public static void main(String[] args) 
 
	{
		Square s=new Square(10);
		
		System.out.println(s.calcArea());
		
		System.out.println(s.calcPeri1());
		
 
	}
 
}