package javapgm1;

import java.util.Scanner;

public class LCMOfNumbers
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int i,no1,no2,gcd=1;
		System.out.println("Enter two numbers:");
		no1=s.nextInt();
		no2=s.nextInt();
		s.close();
		for(i=1;(i<=no1)&&(i<=no2);i++)
		{
			if((no1%i==0)&&(no2%i==0))
			gcd=i;	
		}
		int lcm=(no1*no2)/gcd;
		System.out.println("The LCM of two numbers "+no1+" and "+no2+" is "+lcm);
	}

}
