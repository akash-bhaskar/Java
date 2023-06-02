package Interface;

public class Inter implements Inter3
{

	@Override
	public void demo1() 
	{
		System.out.println("Akash Bhaskar");
		
	}

	@Override
	public void demo2() 
	{
		System.out.println("Ganesh Taware");
		
	}

	@Override
	public void demo3() 
	{
		System.out.println("Shubham Palapure");
		
	}

	public static void main(String[] args) 
	{
		Inter i=new Inter();
		i.demo1();
		i.demo2();
		i.demo3();
	}
}
