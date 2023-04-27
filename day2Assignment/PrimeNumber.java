package week1.day2Assignment;

import java.util.Iterator;

public class PrimeNumber
{

	public static void main(String[] args) 
	{
		int input=13;
		boolean flag=false;
		for (int i = 2; i < input/2; i++)
		{
			if(input%i==0)
			{
				flag=true;
			    break;
			}
	   }
	
	  if(!flag)
	  {
		  System.out.println("13 is a Prime Number");
	  }
	  else
	  {
		  System.out.println("13 is not a Prime Number");
	  }
	  
	}
  }

 