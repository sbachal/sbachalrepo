
public class Employee 
{
  int id;
  String name;
  Employee (int id, String name)
  {
	  this.id = id;
	  this.name = name;
  }
  void display()
  {
	  System.out.println(id + " " + name);
  }
}
