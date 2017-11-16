
public class TestThread2 extends Thread 
{
	public void run()
	{
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestThread2 t2 = new TestThread2();
		t2.start();
	}

}
