package javapgm1;
import java.util.*;
public class PositiveNegative 
{
	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("NUMBER:");
		a=s.nextInt();
		if(a>0)
		
		
			System.out.println("The given number "+a+" is positive");
		
		
		else if(a<0)
			System.out.println("The given number "+a+" is negative");
		else
			System.out.println("The number is zero");
		
		s.close();
	}
}

	
