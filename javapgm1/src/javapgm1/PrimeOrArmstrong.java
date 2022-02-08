package javapgm1;
import java.util.*;
public class PrimeOrArmstrong 
{

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		int number;
		System.out.print("Number = ");
		number=s.nextInt();
		
		isArmstrong(number);
		isPrime(number);
		s.close();
	}
	
	public static void isArmstrong(int number)
	{
		int t,temp,remainder,sum=0;
		int count=0;
		
		
		t=number;
		temp=number;
		//Counting digits
		while(number!=0)
		{
			int digit=number%10;
			count=count+1;
			number=number/10;
			
		}
		//calculating
		while(t!=0)
		{
			remainder=t%10;
			sum=(int) (sum+Math.pow(remainder,count));
			t=t/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Its a armstrong number");
		}
		
	}
	
	public static void isPrime(int number)
	{
		int i,count=0;
			
		if(number==1||number==0)
		{
			if(number==1)
			System.out.println(number+" neither prime not composite");
			else
				System.out.println(number+" is not prime number");
		}
		else
		{
			if(number>=2)
			{	
				for(i=2;i<number;i++)
					{
						if(number%i==0)
							{
								count++;
							}
					}
			if(count==0)
				System.out.println(number+" is a prime number");
			
		}
		
	 }	
	}

}
