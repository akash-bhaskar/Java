package LogicalPrograms;


public class PrimeNumber
{
	public static void main(String[] args) 
	{
		int num=8;
		int temp=0;
		int i;
		
		for (i=2; i<num; i++) 
		{
			if (num%i==0) 
			{
				temp=temp+1;
			}
		}
		if (temp==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
}
