package javapgm1;
import java.util.*;

public class PowerOfNumber
{
	public static void main(String[] args)
	{
		int base,exponent,i,power=1;
		Scanner y=new Scanner(System.in);
		System.out.println("Enter the base value : ");
		base=y.nextInt();
		System.out.println("Enter the Exponent value : ");
		exponent=y.nextInt();
		y.close();
		for(i=1;i<=exponent;i++)
		{
			power=power*base;
		}
		System.out.println(base+" to the power "+exponent+" is "+power);
	}
}
