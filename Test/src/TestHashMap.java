import java.util.*;
public class TestHashMap
{

	public static void main(String[] args)
	{
				// TODO Auto-generated method stub
				 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
			      /*Adding elements to HashMap*/
			      hmap.put(12, "Chaitanya");
			      hmap.put(2, "Rahul");
			      hmap.put(7, "Singh");
			      hmap.put(49, "Ajeet");
			      hmap.put(3, "Anuj");

			      /* Display content using Iterator*/
			      Set set = hmap.entrySet();
			      Iterator iterator = set.iterator();
			      while(iterator.hasNext()) 
			      {
			         Map.Entry me = (Map.Entry)iterator.next();
			         System.out.print("key is: "+ me.getKey() + " & Value is: ");
			         System.out.println(me.getValue());
			      }
	}
}
