package LogicalPrograms;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String name="AKASH BHASKAR";
		int len=name.length();
		System.out.println("The lenth of given string is : "+len);
		
		String rev="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("The reverse of given string is : "+rev);
		
		//Palindrome
		if (name.equalsIgnoreCase(rev)) 
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}
