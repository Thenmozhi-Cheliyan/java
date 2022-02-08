package javapgm1;
import java.util.*;

public class Large
{

	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a:");
		a=s.nextInt();
		System.out.println("Enter b:");
		b=s.nextInt();
		System.out.println("Enter c:");
		c=s.nextInt();
		s.close();
		if(a>b)
			{
				if(a>c)
				{
					System.out.println("The a value is largest");
				}
				else
				{
					System.out.println("The c value is largest");
				}
			}
		else
			{
				if(b>c)
				{
					System.out.println("The b value is largest");
				}
				else
				{
					System.out.println("The c value is largest");
	
				}	
			}
		}
}
	


