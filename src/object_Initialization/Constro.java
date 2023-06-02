package object_Initialization;

public class Constro 
{
	String name;
	int roll;
	
	protected Constro(String a,int b) 
	{
		name=a;
		roll=b;
		
		System.out.println(name+ " : "+roll);
		
	}
	
	public static void main(String[] args) 
	{
		Constro i=new Constro("Akash Bhaskar", 25);
		
		
	}
}
