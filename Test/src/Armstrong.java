import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter number to verify for Armstrong Number");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		int a;
		int b = 0;
		int temp = number;  
	   
	    while(number > 0)  
	    {  
	    a = number % 10;  
	    number = number / 10;  
	    b = b + (a*a*a);  
	    }
	    
	    if(temp == b)  
	    System.out.println("Armstrong number");   
	    else  
	        System.out.println("Not Armstrong number");   
	}  
}