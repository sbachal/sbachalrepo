import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestLinkedHashMap 
{

	public static void main(String[] args)
	{
				// TODO Auto-generated method stub
		Employee e1 = new Employee (111, "Sagar");
		Employee e2 = new Employee (112, "Naren");
		Employee e3 = new Employee (113, "Shweta");
		Employee e4 = new Employee (114, "Arvind");
				 LinkedHashMap<Integer, Employee> hmap = new LinkedHashMap<Integer, Employee>();
			      /*Adding elements to HashMap*/
			      hmap.put(12, e1);
			      hmap.put(2, e2);
			      hmap.put(7, e3);
			      hmap.put(49, e4);
			      

			      /* Display content using Iterator*/
			      Set set = hmap.entrySet();
			      Iterator itr = set.iterator();
			      while(itr.hasNext()) 
			      {
			         Map.Entry me = (Map.Entry)itr.next();
			         System.out.println("key is: "+ me.getKey() + " & Value is: "+me.getValue());
			      }
	}

}
