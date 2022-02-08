package javapgm1;
import java.util.*;
public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int number,lastDigit,reverse=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		number=s.nextInt();
		s.close();
		do
		{
			lastDigit=number%10;
			reverse=(reverse*10)+lastDigit;
			number=number/10;
		}
		while(number>0);
		System.out.println("REVERSE NUMBER = "+reverse);
	}
}
