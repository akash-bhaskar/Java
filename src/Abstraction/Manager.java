package Abstraction;

public class Manager extends Emplyee2
{

	@Override
	public void demo1() 
	{
		System.out.println("Salaries of Employee :-");
	}
	
	public static void main(String[] args) {
		Manager i=new Manager();
		
		i.demo1();
		i.demo2();
		i.demo3();
	}
	
	
}
