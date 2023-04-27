package week1.day2Assignment;

public class PositiveNegative {

	public static void main(String[] args)
	{
	    int number=35;
	    if(number > 0)
	    {
	    	System.out.println(number +" "+ "is a Positive Number");
	    }else if(number < 0)
	    {
	       System.out.println(number +" "+"is a Negative Number");
	    }else if(!(number>0)&(!(number<0)))
	    {
	    	System.out.println("The Number is Neither Positive Nor Negative");
	    }

	}

}
