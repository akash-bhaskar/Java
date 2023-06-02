package object_Initialization;

public class RefVariable 
{
	String name;
	int age;
	
	public static void main(String[] args) 
	{
		
		RefVariable set=new RefVariable();
		set.name="Akash Bhaskar";
		set.age=25;
		
		System.out.println(set.name);
		System.out.println(set.age);
	}
}
