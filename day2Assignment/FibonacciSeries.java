package week1.day2Assignment;
public class FibonacciSeries
{

	public static void main(String[] args) 
	{
		int range=8;
		int firstNum=0;
		int secondNum=1;
		System.out.print(firstNum+","+secondNum);
		for (int i = 0; i <range-2; i++)
		{
			int sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
		    System.out.print(","+sum);
		} 
    }
}







	


