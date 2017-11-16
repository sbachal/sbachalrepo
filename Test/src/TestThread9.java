
public class TestThread9 extends Thread 
{
	public void run()
	{
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread");
		}
		else 
			System.out.println(Thread.currentThread().getName());
				try 
				{
					Thread.sleep(500);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestThread9 t1 = new TestThread9();
		TestThread9 t2 = new TestThread9();
		TestThread9 t3 = new TestThread9();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t2.setName("Thread3");
		t1.setDaemon(true);
//		t1.setPriority(MAX_PRIORITY);
//		t2.setPriority(NORM_PRIORITY);
//		t3.setPriority(MIN_PRIORITY);
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		System.out.println(t3.getPriority());
		
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
//		System.out.println(t3.getName());
//		System.out.println(t1.getId());
//		System.out.println(t2.getId());
//		System.out.println(t3.getId());
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
