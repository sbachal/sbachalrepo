
public class TestThread4 extends Thread 
{
	public void run()
	{
		for (int i = 1; i < 5; i++)
		{
			System.out.println(i);
			
			try 
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

public static void main(String[] args) 
  {
			// TODO Auto-generated method stub
			TestThread4 t1 = new TestThread4();
			TestThread4 t2 = new TestThread4();
			TestThread4 t3 = new TestThread4();
			t1.start();
			
			try 
			{
				t1.join();
			}
			
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
			
			t2.start();
			t3.start();
	}
}

