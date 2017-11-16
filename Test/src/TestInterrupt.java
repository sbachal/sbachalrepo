
public class TestInterrupt extends Thread 
{  public void run ()
	{
	System.out.println("Thread is Running");
			try
			{
				System.out.println("Thread is Sleeping");
				Thread.sleep(10000);
				
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		TestInterrupt t1 = new TestInterrupt ();
		t1.start();
		
		try
		{
			System.out.println ("Thread is Interrupted");
			t1.interrupt();
			
		}
		 catch (Exception e)
		{
			 
		}

	}

}
