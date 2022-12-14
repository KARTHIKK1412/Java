//import java.util.*;
class Table
{
	synchronized void printtable(int a)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(a*i);
			
			try
			{
				Thread.sleep(1000);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}

class ThreadA extends Thread
{
	Table t;
	ThreadA(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		System.out.println("Thread A : Table 6");
		t.printtable(6);
		System.out.println("Exit form ThreadA");
	}
}


class ThreadB extends Thread
{
	Table t;
	ThreadB(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
			//System.out.println(Thread B : Table 10");
		t.printtable(10);
			//System.out.println("Exit form ThreadB");
	}
}


class MainSynchro
{
	public static void main(String ars[])
	{
		Table obj = new Table();
		ThreadA t1 = new ThreadA(obj);
		ThreadB t2 = new ThreadB(obj);
		t1.start();
		t2.start();
	}
}