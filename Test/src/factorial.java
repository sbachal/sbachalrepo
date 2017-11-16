import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number to find its factorial");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int fact = 1;
		
		for (int i = 1; i <= number; i++ )
		{
			fact = fact*i;
		}
	  System.out.println(fact);
	}

}
