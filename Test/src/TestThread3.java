
public class TestThread3 extends Thread 
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
		TestThread3 t1 = new TestThread3();
		TestThread3 t2 = new TestThread3();
		t1.run();
		t2.run();
//		t1.start();
//		t2.start();
	}

}
