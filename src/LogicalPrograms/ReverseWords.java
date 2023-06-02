package LogicalPrograms;



public class ReverseWords 
{
	public static void main(String[] args) 
	{
		String name="My name is Akash";
		String a[]=name.split(" ");
		int len=a.length;
		System.out.println("The length of string is : "+len);
		
		for(int i=len-1; i>=0; i--)
		{
			System.out.println(a[i]+" ");
		}
	}
	
}
