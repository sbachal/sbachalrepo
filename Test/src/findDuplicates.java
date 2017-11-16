import java.util.Scanner;

public class findDuplicates {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter word");
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		
		 for(int i=0; i<str.length();i++)
		    {
		        for( int j=i+1; j<str.length();j++)
		        {
		            if(str.charAt(i) == str.charAt(j))
		            {
		                System.out.println(str.charAt(j)); 
		                
		                break;
		            }
		        }
		    }
	}

}
