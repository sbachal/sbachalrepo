import java.lang.Throwable;
public class TestException {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try 
		{
			int arr [] = new int [5];
			arr[10] = 10/0;
		}
		
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}
