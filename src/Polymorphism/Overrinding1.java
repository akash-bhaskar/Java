package Polymorphism;

public class Overrinding1 extends Overloading1
{
	public void info()
	{
		System.out.println("Overriding in different class");
	}
	
	String name;
	public void info(String a)
	{
		name =a;
		System.out.println(a);
	}
	
	public int info(int b)
	{
		return b;
	}
	
	public static void main(String[] args) 
	{
		Overrinding1 o=new Overrinding1();
			
			o.info();
			o.info("Ganesh Taware");
			System.out.println(o.info(21));
	}
}
