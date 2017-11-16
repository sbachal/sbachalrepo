import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the limit for fibonacci series");
		Scanner input = new Scanner (System.in);
		int limit = input.nextInt();
		int arr[] = new int [limit];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < limit; i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
		}
		for (int i = 0; i < limit; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
