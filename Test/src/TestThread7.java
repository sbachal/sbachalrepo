
public class TestThread7 extends Thread 
{
	public TestThread7(ThreadGroup tg1, String name) 
	{
		// TODO Auto-generated constructor stub
		super (tg1, name);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());	
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThreadGroup tg1 = new ThreadGroup("MyGroup1");
		TestThread7 t1 = new TestThread7 (tg1, "MyThread1");
		t1.start();
		TestThread7 t2 = new TestThread7 (tg1, "MyThread2");
		t2.start();
		System.out.println(tg1.activeCount());		
	}

}
