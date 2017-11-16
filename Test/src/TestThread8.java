
public class TestThread8 extends Thread 
{
  synchronized static void paint1 ()
  {
	  for (int i = 1; i < 5; i++)
	  {
		  System.out.println(i);
	  }
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
  
  synchronized static void paint2 ()
  {
	  for (int i = 1; i < 5; i++)
	  {
		  System.out.println(5 * i);
	  }
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
  
  synchronized static void paint3 ()
  {
	  for (int i = 1; i < 5; i++)
	  {
		  System.out.println(10 * i);
	  }
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
  
  public void run ()
  {
	  paint1();
	  paint2();
	  paint3();
  }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		TestThread8 t1 = new TestThread8();
		TestThread8 t2 = new TestThread8();
		TestThread8 t3 = new TestThread8();
		t1.start();
		t2.start();		
		t3.start();
	}

}
