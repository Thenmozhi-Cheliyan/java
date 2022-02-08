package javapgm1;
import java.util.*;
public class AreaOfRectangle 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		double l,b,area;
		System.out.println("Enter length:");
		l=sc.nextDouble();
		System.out.println("Enter breadth:");
		b=sc.nextDouble();
		area=l*b;
		System.out.println("The area of the rectangle is "+area);	
		sc.close();

	}

}
