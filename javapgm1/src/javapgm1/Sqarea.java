package javapgm1;
import java.util.*;
public class Sqarea 
{
	public static void main(String[] args) 
	{
		Scanner y=new Scanner(System.in);
		System.out.println("Enter the side value:");
		long a=y.nextInt();
		long area=a*a;
		System.out.println("Then area of a square with side "+a+" is "+area);
		y.close();
	}
}
