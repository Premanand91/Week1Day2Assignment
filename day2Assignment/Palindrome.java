package week1.day2Assignment;

public class Palindrome
{

	public static void main(String[] args)
	{
		int num=34343;
		int output=0;
		int rem;
		int input=num;
		for (num=34343;num>0;num=num/10)
		{
			rem=num%10;
			output=output*10+rem;
		}
		if(input==output)
		{
			System.out.println("The Given Number is Palindrome");
		}else
		{
			System.out.println("The Given Number is not a Palindrome ");
		}
	 }
}


