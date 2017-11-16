
public class ThreadTest1 
{
	public static void print1 ()
		{
			for (int i = 1 ; i < 5; i++)
			{
				System.out.println(i);
			}
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
