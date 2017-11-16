
public class TestThread1 implements Runnable {

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestThread2 t1 = new TestThread2();
		Thread td1 = new Thread(t1);
		td1.start();
	}

}
