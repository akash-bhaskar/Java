package LogicalPrograms;

public class ReverseNum 
{

	public static void main(String[] args) 
	{
	 
		int num=1891, i,rem,rev=0;
		
		for(i=num; i!=0; i=i/10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		
		System.out.println("Reverse Number is : "+rev);
	}
	
}
