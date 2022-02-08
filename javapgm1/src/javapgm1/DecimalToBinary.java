package javapgm1;
import java.util.*;
public class DecimalToBinary
{

	public static void main(String[] args) 
	{
		System.out.println(" DECIMAL TO BINARY AND VICE VERSA");
		Scanner s=new Scanner(System.in);
		System.out.println("*************OPTIONS*************");
		System.out.println(" 1 --> Decimal to Binary");
		System.out.println(" 2 --> Binary to Decimal");
		System.out.println("*********************************");
		int exp;
		System.out.println("Enter option:");
		exp=s.nextInt();
		
		switch(exp)
		{
		case 1:
			System.out.println("Decimal to Binary");
			int number,i=0;
			int binary[]=new int[100];
			
			System.out.print("Decimal Number = ");
			number=s.nextInt();
			int t=number;
			
			while(t!=0)
			{
				binary[i]=t%2;
				t=t/2;
				i++;
			}
		System.out.print("The binary equivalent of "+number+" is ");
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(""+binary[j]);
		}
		
		break;
		
		case 2:
			System.out.println("Binary to Decimal");
			int num;
			System.out.println("Binary Number = ");
			num=s.nextInt();
			int d=0;
			int temp=num;
			int j=0;
			
			while(temp>0)
			{
				int r=temp%10;
				temp=temp/10;
				d=d+r*(int)Math.pow(2, j++);
			}
			System.out.println("Decimal Equivalent of "+num+" is "+d);
			break;
		}	
		s.close();
		}
	}

