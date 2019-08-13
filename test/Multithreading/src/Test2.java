import java.awt.*;

class MovingStrings extends Frame implements Runnable{
	private Thread t1,t2;
	private int x1,x2;
	
	public MovingStrings()
	{
		x1=100;
		x2=200;
		t1=new Thread(this,"zensar");
		t2=new Thread(this,"java");
		t1.start();
		t2.start();
	}





        public void paint(Graphics g) {
        	g.setColor(Color.RED);
        	g.setFont(new Font("verdana",16,20));
        	
        	g.drawString("zensar", x1, 100);
        	g.setColor(Color.blue);
        	g.drawString("JAVA", x2, 200);
        	
        }
        
        public void run()
        {
        	while(true)
        	{
        		if(Thread.currentThread()==t1)
        		{
        			x1++;
        		
        		if(x1==this.getWidth())
        		{
        			x1=0;
        		}
        		try {
        			Thread.sleep(30);
        		}catch(Exception e) {}
        		}
        	else if(Thread.currentThread()==t2)
        	{
        		x2--;
        		if(x2==0)
        		{
        			x2=this.getWidth();
        		}
        		try {
        			Thread.sleep(30);
        		}catch(Exception e) {}
        	}
        	repaint();
        }
}
}


public class Test2 {
	public static void main(String []args)
	{
		MovingStrings fr=new MovingStrings();
		fr.setSize(400,400);
		fr.setVisible(true);
		System.out.println("text");
		
	}

}
