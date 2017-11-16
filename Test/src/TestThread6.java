
public class TestThread6 extends Thread 
{

	public void run()
	{
		System.out.println("Thread is Running");
		try 
		{
			Thread.sleep(500);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
	}

public static void main(String[] args) 
  {
			// TODO Auto-generated method stub
			TestThread6 t1 = new TestThread6();
			TestThread6 t2 = new TestThread6();
			TestThread6 t3 = new TestThread6();
			t1.setName("SAGAR 1");
			t2.setName("SAGAR 2");
			t3.setName("SAGAR 3");
			t1.setPriority(MAX_PRIORITY);
			t2.setPriority(NORM_PRIORITY);
			t3.setPriority(MIN_PRIORITY);
			t1.start();
			t2.start();
			t3.start();	
			System.out.println(t1.getName());
			System.out.println(t1.getPriority());
			System.out.println(t2.getName());
			System.out.println(t2.getPriority());
			System.out.println(t3.getName());
			System.out.println(t3.getPriority());
	}
}

