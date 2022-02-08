package javapgm1;
import java.util.*;

public class LeapYear
{

	public static void main(String[] args)
	{
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=s.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
			System.out.println("The given year is a leap year");
		else
			System.out.println("The given year is not a leap year");
		
		s.close();
	}

}
