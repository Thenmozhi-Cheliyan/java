package javapgm1;
import java.util.*;
public class SumOfTwoPrime 
{
	public static void main(String[] args) 
	{
		int number;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.print("Number = ");
		number=s.nextInt();
		s.close();
		
		for(int i=2;i<=number/2;i++)
		{
			if(checkPrime(i))
			{
				if(checkPrime(number-i))
				{
					System.out.printf("%d = %d + %d\n",number,i,number-i);
					flag=true;
				}
			}
		}
		
		if(!flag)
		{
			System.out.println(number+" cannot be expressed as sum of two prime numbers.");
		}
	}
	
	static boolean checkPrime(int num)
	{
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}
