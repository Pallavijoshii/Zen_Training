package mypac;

import java.util.*;

public class account {

	static AccountHolder accountHolder[];
	static int counter=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		accountHolder = new AccountHolder[100];
		menu(sc);

	}
	
	public static void menu(Scanner sc) {
		
		int accNo=0;
		String accName="";
		double accBal=0, amount=0;
		System.out.println("Add Record - 1\nDisplay All-2\nDeposit-3\nWithdraw-4\nExit-5\n::");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("Enter your account no.: ");
			accNo = sc.nextInt();
			System.out.println("Enter your Name: ");
			accName = sc.next();
			System.out.println("Enter your Bal: ");
			accBal = sc.nextDouble();
			accountHolder[counter] = new AccountHolder(accNo, accName, accBal);
			counter++;
			System.out.println("\n");
			menu(sc);
			break;
		case 2:
			for(int j=0; accountHolder[j]!=null; j++) {
				System.out.println(accountHolder[j]+"\n");
			}
			System.out.println("\n");
			menu(sc);
			break;
		case 3:
			System.out.println("Enter account no.: ");
			accNo=sc.nextInt();
			System.out.println("Enter amount: ");
			amount=sc.nextDouble();
			for(int j=0; accountHolder[j]!=null; j++) {
				if(accountHolder[j].getAccNo()==accNo)
					System.out.println("Updated balance: "+accountHolder[j].deposit(amount));
			}
			System.out.println("\n");
			menu(sc);
			break;
		case 4:
			System.out.println("Enter account no.: ");
			accNo=sc.nextInt();
			System.out.println("Enter amount: ");
			amount=sc.nextDouble();
			for(int j=0; accountHolder[j]!=null; j++) {
				if(accountHolder[j].getAccNo()==accNo)
					System.out.println("Updated balance: "+accountHolder[j].withdraw(amount));
			}
			System.out.println("\n");
			menu(sc);
			break;
			
		case 5:
			System.out.println("Exit...");
			System.exit(0);
		}
	}

}

class AccountHolder{
	
	private int accNo;
	private String accName;
	private double accBal;
	
	AccountHolder(int accNo, String accName, double accBal){
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
		System.out.println("Details added...");
	}
	
	public double deposit(double depositAmount) {
		accBal = accBal+depositAmount;
		return accBal;
	}
	
	public double withdraw(double withdrawAmount) {
		accBal=accBal-withdrawAmount;
		return accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public String toString() {
		return "Account No: "+accNo+"\nAccount Name: "+accName+"\nCurrent Balance: "+accBal;
	}
}
