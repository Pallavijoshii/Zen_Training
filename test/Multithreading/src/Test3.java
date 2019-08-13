//thread synchronization

class Account
{
    private int balance;
    public Account(int b)
    {
    	balance=b;
    }
    
    public void deposit(int amount)    //adding synchronized block for avoiding thread interference
    {
    	synchronized(this)
    	{
    	System.out.println("balance before deposit "+balance);
    	try {
    		Thread.sleep(60);
    	}catch(InterruptedException e) {}
    	
    	balance=balance+amount;
    	System.out.println("balance after deposit "+balance);
    	
    	try {
    		Thread.sleep(60);
    	}catch(InterruptedException e) {}
    }
    }

public synchronized void withdraw(int amount)    //instead of making sync. block we can also go for synchronized method
{
	System.out.println("balance before withdraw  "+balance);
	try {
		Thread.sleep(60);
	}catch(InterruptedException e) {}
	
	balance=balance-amount;
	System.out.println("balance after withdraw "+balance);
	try {
		Thread.sleep(60);
	}catch(InterruptedException e) {}
}
}

class AccountUser extends Thread

{
	private String name,tot;
    private Account account;
    private int amount;
    public AccountUser(Account acc,String n,String tt,int amt)
    {
    	account=acc;
    	name=n;
    	tot=tt;
    	amount=amt;
    }
    public void run()
    {
    	if(tot.equals("deposit"))
    	{
    		account.deposit(amount);
    	}
    	else if(tot.equals("withdraw"))
    	{
    		account.withdraw(amount);
    	}
    }
}


public class Test3 {
	public static void main(String[] args)

	{
		Account acc=new Account(50000);
		AccountUser user1=new AccountUser(acc,"user1","deposit",5000);
		AccountUser user2=new AccountUser(acc,"user2","withdraw",2000);
		user1.start();
		user2.start();
	}

}
