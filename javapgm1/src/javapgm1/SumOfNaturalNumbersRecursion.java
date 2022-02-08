package javapgm1;
import java.util.*;
public class SumOfNaturalNumbersRecursion
{
	static int naturalNumbers(int n)
	{
		if(n!=0)
			return(n+naturalNumbers(n-1));
		else
			return 0;
		
	}
	public static void main(String args[])
	{
		int num,sum=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		sum=naturalNumbers(num);
		System.out.println("Sum of "+num+" natural numbers is "+sum);
		s.close();
	}
}
