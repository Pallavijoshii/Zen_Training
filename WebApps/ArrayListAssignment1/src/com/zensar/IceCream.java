/*package com.zensar;

import java.util.ArrayList;
import java.util.Scanner;

public class Icecream {
	private ArrayList<String> flavour;
	private ArrayList<Float> price;
//  private float discount;
	
	private Icecream(ArrayList<String> flavour,ArrayList<Float> price)
	{
		this.flavour=flavour;
		this.price=price;
		
		String f1;
		double discount=0;
		for(int i=0;i<flavour.size();i++)
		{
			for(int j=0;i<price.size();j++)
			{
				f1=flavour.get(i);
				if(f1=="Chocolate")
					discount=10.75;
				else
					discount=5.25;
			}
			Float new_price;
			new_price
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		flavour=sc.next();
        price=sc.nextFloat();
       
		

	}

}*/



package com.zensar;

public class IceCream {
	private String flavour;
	private double price;
	private double discount;

	public IceCream() {
		super();
	}

	public IceCream(String flavour, double price) {
		this.flavour = flavour;
		this.price = price;
		if(flavour.equalsIgnoreCase("chocolate")) {
		discount = 10.75;
		}else {
			discount = 5.25;
		}
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "IceCream [flavour=" + flavour + ", price=" + price + ", discount=" + discount + "]";
	}

}