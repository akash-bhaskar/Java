package LogicalPrograms;

public class Fibbonacci
{

	public static void main(String[] args) 
	{
		//0,1,2,3,5............
		
		int firstNo=0;
		int nextNo=1;
		int series=0;
		int upto=10;
		
		for(int i=0; i<upto; i++)
		{
			series=firstNo+nextNo;
			System.out.println(series);
			firstNo=nextNo;
			nextNo=series;
		}
	}
}
