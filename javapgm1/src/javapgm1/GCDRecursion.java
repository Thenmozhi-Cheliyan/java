package javapgm1;
import java.util.*;
public class GCDRecursion
{

	public static void main(String[] args)
	{
		// GCD of two numbers using Recursion
		Scanner s=new Scanner(System.in);
		int num1,num2;
		System.out.print("Number 1 = ");
		num1=s.nextInt();
		System.out.print("Number 2 = ");
		num2=s.nextInt();
		System.out.println("GCD of two numbers "+num1+" & "+num2+" is "+gcd(num1,num2));
		
		s.close();
	}
	public static int gcd(int no1,int no2)
	{
		if(no2!=0)
		{
		return gcd(no2,no1%no2);
		
		}
		else
		{
			return no1;
		}
	}
}
