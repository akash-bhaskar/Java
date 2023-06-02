package Inheritance;

public class Principal extends Teacher
{
	public void set1()
	{
		System.out.println("Principal Name :-");
		System.out.println("Mr. R.D Pote");
	}
	
	public static void main(String[] args) 
	{
		Principal object=new Principal();
		
			object.set1();
			object.demo1();
			object.info1();
			
	}
}
