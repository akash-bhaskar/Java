package Inheritance;

public class Teacher extends Student
{
	
	public void demo1()
	{
		System.out.println("Faculty Name :-");
		System.out.println("Miss. Petkar K.S");
	}
	
	public static void main(String[] args) 
	{
		Teacher obj=new Teacher();
			obj.demo1();
			obj.info1();
			
	}
}
