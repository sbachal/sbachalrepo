
public class TestSynchronization
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Thread t1 = new Thread()
		{
			public void run ()
			{
				c1.withdraw(15000);
			}
		};
		t1.start();
		
		Thread t2 = new Thread()
		{
			public void run ()
			{
				c1.deposite(10000);
			}
		};
		t2.start();

	}

}
