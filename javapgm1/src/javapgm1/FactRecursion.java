package javapgm1;
import java.util.*;
public class FactRecursion
{
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	

	public static void main(String[] args)
	{
		int fact=1,number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		number=s.nextInt();
		fact=factorial(number);
		System.out.println("The factorial of "+number+" is "+fact);
		
		s.close();
	}

}
