package javapgm1;
import java.util.*;
public class PolynomialEquation
{

	public static void main(String[] args)
	{		
		Scanner scan_input=new Scanner(System.in);
		double a,b,c,mul;
		double value1,value2;
		System.out.print("a = ");
		a=scan_input.nextDouble();
	
		System.out.print("b = ");
		b=scan_input.nextDouble();
		
		System.out.print("c = ");
		c=scan_input.nextDouble();
		
		//Quadratic equation
		
		mul=b*b-4*a*c;
		
		value1=(-b+Math.sqrt(mul))/(2*a);
		System.out.println("X1 = "+value1);
		value2=(-b-Math.sqrt(mul))/(2*a);
		System.out.println("X2 = "+value2);
		
		//polynomial equation
		
		//Substituting the values of roots in polynomial equation
		
		value1=(a*value1*value1)+(b*value1)+c;
		value2=(a*value2*value2)+(b*value2)+c;
		
		if(value1==0 && value2==0)
		{
			System.out.println("Its a polynomial equation");
		}
		else
		{
			System.out.println("Its not a polynomial equation");
		}
		
		scan_input.close();		
	}
}
