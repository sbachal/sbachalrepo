import java.util.Scanner;

public class wordsCount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter setence");
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		String[] str2 = str.split(" ");
		System.out.println(str2.length);
	}

}
