package LogicalPrograms;

public class Palindrome 
{

	public static void main(String[] args)
	{
		int num=181,i,rem,rev=0;
		
		for(i=num; i!=0; i=i/10)
		{
			rem=i%10;
			rev=rev*10+rem;			
		}
		
		if (num==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is Not Palindrome");
		}
	}
}
