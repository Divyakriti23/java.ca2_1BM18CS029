/*WAP to create 2 threads, one thread displaying BMSCE, every 10s and another displaying CSE, once in 2s.*/

import java.util.*;
class Thread1 implements Runnable
{
	Thread t1;
	Thread1()
	{
		t1 = new Thread(this, "t1");
		t1.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("BMSCE");
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				System.out.println("BMSCE thread interrupted");
			}
		}
	}
}
class Thread2 implements Runnable
{
	Thread t2;
	Thread2()
	{
		t2 = new Thread(this, "t2");		
		t2.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("CSE");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("CSE thread interrupted");
			}
		}
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		new Thread1();
		new Thread2();
	}
}


/*Output:
BMSCE
CSE
CSE
CSE
CSE
CSE
BMSCE
CSE
CSE
CSE
CSE
CSE
BMSCE
CSE
CSE....so on*/
