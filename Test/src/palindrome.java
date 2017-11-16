import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a string to check for Palindrom");
		Scanner input = new Scanner (System.in);
		String original = input.nextLine();
		String reverse ="";
		int length = original.length();
		
		for (int i = length-1; i >= 0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		if (original.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
			System.out.println("String is not Palindrome");
	}

}
