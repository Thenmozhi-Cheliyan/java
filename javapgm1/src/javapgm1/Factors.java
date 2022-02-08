package javapgm1;
import java.util.*;
public class Factors
{

	public static void main(String[] args) 
	{
		Scanner y=new Scanner(System.in);
		int i,n;
		System.out.println("Enter number For finding factors:");
		n=y.nextInt();
		y.close();
		System.out.println("The factors of "+n+" are");
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			System.out.println(i);
		}
		

	}

}
