package javapgm1;
import java.util.*;
public class NumberOfDigits 
{
	public static void main(String[] args)
	{
		int num,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		System.out.print("The number of digits in "+num+" is ");
		while(num!=0)
		{
		num/=10;
		count++;
		}
		System.out.print(count);
		
		s.close();
	}
}
