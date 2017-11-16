
public class Bike extends Vehicle 
{
	void run()
	{
		System.out.println("Bike is running");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vehicle v1 = new Bike();
		if(v1 instanceof Bike)
		{
			Bike b1 = (Bike) v1;
			b1.run();
		}
	}

}
