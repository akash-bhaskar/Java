package Polymorphism;

public class Overloading1 
{
	public void info()
	{
		System.out.println("Overloading in same class");
	}
	
	String name;
	public void info(String a)
	{
		name =a;
		System.out.println(a);
	}
	
	 int info(int b)
	{
		return b;
	}
	
	public static void main(String[] args) 
	{
		Overloading1 i=new Overloading1();
			
			i.info("Akash Bhaskar");
			System.out.println(i.info(25));
	}
}


