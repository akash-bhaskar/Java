package Polymorphism;

public class Overloading2 extends Overloading1
{
	
	String name;
	String email;
	 void info(String a,String b)
	{
		name =a;
		email=b;
		System.out.println(a);
		System.out.println(b);
	}
	
	public int info(int b)
	{
		return b;
	}
	
	public static void main(String[] args) 
	{
		Overloading2 o=new Overloading2();
			o.info("Akash", "akashbhaskar1104@gmail.com");
			o.info(21);
			o.info("Ganesh Taware");
	}
}
