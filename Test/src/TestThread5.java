public class TestThread5 extends Thread 
{
	public void run()
	{
		//System.out.println("Thread is Running");
		System.out.println(Thread.currentThread().getName());
	}

public static void main(String[] args) 
  {
			// TODO Auto-generated method stub
			TestThread5 t1 = new TestThread5();
			TestThread5 t2 = new TestThread5();
			TestThread5 t3 = new TestThread5();
			t1.setName("SAGAR 1");
			t2.setName("SAGAR 2");
			t3.setName("SAGAR 3");
			t1.start();
			t2.start();
			t3.start();			
//			System.out.println(t1.getName());
//			System.out.println(t2.getName());
//			System.out.println(t3.getName());
			System.out.println(t1.getId());
			System.out.println(t2.getId());
			System.out.println(t3.getId());
			
	}
}

