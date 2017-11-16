import java.util.Scanner;

public class PrintCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		System.out.println("Enter count to print numbers");
		Scanner input = new Scanner(System.in);
		count=input.nextInt();
		for (int i=1; i<=count; i++)
		{
			System.out.println(i);
		}
	}

}
