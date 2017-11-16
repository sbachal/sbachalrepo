
public class Customer 
{
	int amount =10000;
 synchronized void withdraw (int a)
 {
	 System.out.println("Withdraw started");
	 
	 if (amount< a)
	 {
		 System.out.println("Insufficient Balance wait for Deposite");
			 try 
			 {
				wait();
			 } 
			 catch (InterruptedException e) 
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
	 }
	 else 
		 	amount = amount -a;
	 		System.out.println("Withdraw Completed");
 }
 synchronized void deposite (int a)
 {
	 System.out.println("Deposite Started");
	 amount = amount +a;
	 System.out.println("Deposite Completed");
	 notify();
 }
}
