import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class TestHashSet
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee (111, "Sagar");
		Employee e2 = new Employee (112, "Naren");
		Employee e3 = new Employee (113, "Shweta");
		Employee e4 = new Employee (114, "Arvind");
				// TODO Auto-generated method stub
				 HashSet<Employee> hs = new HashSet<Employee>();
			      /*Adding elements to HashMap*/
			      hs.add(e1);
			      hs.add(e2);
			      hs.add(e3);
			      hs.add(e4);
			     

			      /* Display content using Iterator*/
		
			      Iterator itr = hs.iterator();
			      while(itr.hasNext()) 
			      {
			        
			        Employee e=(Employee)itr.next();
			         System.out.println(e.id + " " + e.name);
			   
			      }
	}
}
