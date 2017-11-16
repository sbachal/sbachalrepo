import java.util.Scanner;

public class OddEven {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Please enter the number");
		Scanner input= new Scanner(System.in);
		int x = input.nextInt();
		
		if(x % 2 == 0) 
		{
			System.out.println("Number is Even");
		}
		
		else 
		{
			System.out.println("Number is odd'");
		}
		
	}

}
