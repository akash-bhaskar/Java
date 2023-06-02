package Inheritance;


public class Student 
{
	public void info1()
	{
		System.out.println("Details of student :-");
		
		String name="Akash Bhaskar";
		int rollNo=21;
		
		System.out.println(name);
		System.out.println(rollNo);
	}
	
	
	public static void main(String[] args) 
	{
		Student i=new Student();
			i.info1();
			
	}
	
}
