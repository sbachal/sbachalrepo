
public class TestThread10 extends Thread 
{
	synchronized void print1 ()
	{
		for (int i = 1 ; i < 5; i++)
		{
			System.out.println(i);
		}
			try 
			{
			Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
	}
	 synchronized void print2 ()
	{
		for (int j = 1 ; j < 5; j++)
		{
			System.out.println(5*j);
		}
			try 
			{
			Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
	}
	public void run()
	{
		print1();
		print2();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		TestThread10 t1 = new TestThread10();
		TestThread10 t2 = new TestThread10();
		t1.start();
		t2.start();
	}

}
