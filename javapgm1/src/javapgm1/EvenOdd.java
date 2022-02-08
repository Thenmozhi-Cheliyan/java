package javapgm1;
import java.util.*;
public class EvenOdd 
{

	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		long number;
		System.out.println("Enter the Number:");
		number=s.nextLong();
		if(number%2==0)
			System.out.println("The Specified number "+number+" is even");
		else
			System.out.println("The Specified number "+number+" is odd");
		s.close();
	}

}
