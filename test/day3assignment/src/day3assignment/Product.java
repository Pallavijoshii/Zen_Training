package day3assignment;

class productDetails
{
	private int productid;
	private String productname;
	private double cost;
	private static int cnt;
	
static
{
	cnt=0;
}

public productDetails()
{
	cnt++;
}

public productDetails(int productid,String productname,double cost)
{
	this.productid=productid;
	this.productname=productname;
	this.cost=cost;
	cnt++;
}

public void display()
{
	System.out.println(productid+"\t"+productname+"\t"+cost);
}
public static void showCnt()
{
	System.out.println("no. of objects-" +cnt);
}
}


public class Product{

	public static void main(String[] args) 
	{
		productDetails pd1=new productDetails();
		productDetails pd2=new productDetails(1,"Mobile",10000);
		productDetails pd3=new productDetails();
		productDetails pd4=new productDetails(4,"Laptop",30000);
		productDetails.showCnt();
	}

}
