package object_Initialization;

public class Method
{
	String name;
	int age;
	
	private void demo(String a,int b) 
	{
		name=a;
		age=b;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	public static void main(String[] args)
	{
		Method i=new Method();
		
		i.demo("Akash Bhaskar",25);
		
	}
}

