package mypac;

import java.util.Scanner;

public class netsalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double HRA,BS,DA,PF,GS,netSalary;
		System.out.println("enter basic salary");
		BS=sc.nextDouble();
		HRA=0.15*BS;
		DA=0.3*BS;
		GS=BS+HRA+DA;
		PF=0.125*GS;
		netSalary=GS-PF;
		System.out.println("Net salary ="+netSalary);
	}

}
