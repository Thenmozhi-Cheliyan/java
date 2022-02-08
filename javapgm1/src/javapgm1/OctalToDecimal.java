package javapgm1;

import java.util.Scanner;

public class OctalToDecimal 
{

	public static void main(String[] args) 
	{
		System.out.println(" OCTAL TO DECIMAL AND VICE VERSA");
		Scanner s=new Scanner(System.in);
		System.out.println("*************OPTIONS*************");
		System.out.println(" 1 --> Decimal to Octal");
		System.out.println(" 2 --> Octal to Decimal");
		System.out.println("*********************************");
		int exp;
		System.out.println("Enter option:");
		exp=s.nextInt();
		
		switch(exp)
		{
		case 1:
			System.out.println("Decimal to Octal");
			int number,i=0;
			int octal[]=new int[100];
			
			System.out.print("Decimal Number = ");
			number=s.nextInt();
			int t=number;
			
			while(t!=0)
			{
				octal[i]=t%8;
				t=t/8;
				i++;
			}
			System.out.print("The Octal equivalent of "+number+" is ");
			for(int j=i-1;j>=0;j--)
			{
				System.out.print(""+octal[j]);
			}
		
			break;
		
		case 2:
			
			System.out.println("Octal to Decimal");
			int num;
			System.out.println("Octal Number = ");
			num=s.nextInt();
			int d=0;
			int temp=num;
			int j=0;
			
			while(temp>0)
			{
				int r=temp%10;
				temp=temp/10;
				d=d+r*(int)Math.pow(8, j++);
			}
			System.out.println("Decimal Equivalent of "+num+" is "+d);
			break;
		}
		s.close();
	}

}

