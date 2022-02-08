package javapgm1;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) 
	{
		int number,lastDigit,reverse=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		number=s.nextInt();
		temp=number;
		do
		{
			lastDigit=number%10;
			reverse=(reverse*10)+lastDigit;
			number=number/10;
		}
		while(number>0);
		System.out.println("REVERSED NUMBER = "+reverse);
		if(reverse==temp)
		{
			System.out.println(temp+" is a palindrome");	
		}
		else
		{
			System.out.println(temp+" is not a palindrome");
		}
		s.close();
	}

}
