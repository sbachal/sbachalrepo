import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class LargestNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter three numbers to compare");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if (x > y && x >z)
		{
			System.out.println("First number is largest");
		}
		else if (y > x && y >z)
		{
			System.out.println("Second number is largest");
		}
		
		else
			System.out.println("Third number is largest");

	}

}
