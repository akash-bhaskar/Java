package LogicalPrograms;

public class ArmstrongNo 
{
	public static void main(String[] args)
	{
		int num=153,i,rem,arm_no=0;                       //153,370.........153=1*1*1*5*5*5*3*3*3
		
		for(i=num; i!=0; i=i/10)
		{
			rem=i%10;
			arm_no=arm_no+rem*rem*rem;
		}
		
		if (num==arm_no)
		{
			System.out.println("Given no. is Armstrong number");
		}
		else
		{
			System.out.println("Given no. is not Armstrong number");	
		}
	}
}
