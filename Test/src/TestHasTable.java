import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHasTable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1 = new Employee (111, "Sagar");
		Employee e2 = new Employee (112, "Naren");
		Employee e3 = new Employee (112, "Naren");
		Employee e4 = new Employee (112, "Naren");
		
		//ArrayList <Employee> al1 = new ArrayList <Employee> ();
		Hashtable <Integer , Employee> ht1 = new Hashtable <Integer , Employee> ();
		
		ht1.put(23, e1 );
		ht1.put(77, e2);
		ht1.put(77, e3);
		ht1.put(0, e4);
		Set s1 = ht1.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey() + " "+ me.getValue());
//			Employee e = (Employee)me.getValue();
//			System.out.println(e.id + " " + e.name);
		}

	}

}
