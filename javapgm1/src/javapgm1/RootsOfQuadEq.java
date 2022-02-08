package javapgm1;
import java.util.*;
public class RootsOfQuadEq 
{
	public static void main(String args[])
	{
		Scanner scan_input=new Scanner(System.in);
		double a,b,c,determinant;
		double root1,root2;
		System.out.print("a = ");
		a=scan_input.nextDouble();
	
		System.out.print("b = ");
		b=scan_input.nextDouble();
		
		System.out.print("c = ");
		c=scan_input.nextDouble();
		
		scan_input.close();
		
		//Calculating the determinant b^2-4ac
		
		determinant=b*b-4*a*c;
		
		//Check if determinant>0 then roots are real and distinct
		
		if(determinant>0)
		{
		root1=(-b+Math.sqrt(determinant))/(2*a);
		root2=(-b-Math.sqrt(determinant))/(2*a);
		
		System.out.println("Root 1 = "+root1);
		System.out.println("Root 2 = "+root2);
		}
		
		//Check if determinant==0 then two real and equal roots
		
		else if(determinant==0)
		{
			root1=root2=-b/(2*a);
			System.out.println("Root 1 = Root 2 = "+root1);
		}
		
		//Check if determinant<0 the roots are imaginary
		
		else
		{
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-determinant)/(2*a);
			System.out.format("Root 1 = %.2f+%.2fi",real,imaginary);
			System.out.println();
			System.out.format("Root 1 = %.2f-%.2fi",real,imaginary);
		}
	}
}
