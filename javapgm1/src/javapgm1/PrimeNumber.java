package javapgm1;
import java.util.*;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i,num,count=0;
		System.out.print("NUMBER = ");
		num=s.nextInt();
		s.close();
		if(num==1||num==0)
		{
			if(num==1)
			System.out.println(num+" neither prime not composite");
			else
				System.out.println(num+" is not prime number");
		}
		else
		{
			if(num>=2)
			{	
				for(i=2;i<num;i++)
					{
						if(num%i==0)
							{
								count++;
							}
					}
			if(count==0)
				System.out.println(num+" is a prime number");
			else
				System.out.println(num+" is not a prime number");
		}
		
	 }	
		
}
}



